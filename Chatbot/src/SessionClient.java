import com.google.api.gax.core.CredentialsProvider;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.dialogflow.v2.*;

import java.io.IOException;
import java.io.InputStream;

public class SessionClient {
    private static final String PROJECT_ID = "your_project_id_here";
    private static final String LANGUAGE_CODE = "en-US";
    private static final String SESSION_ID = "unique_session_id_here";

    private SessionsClient sessionsClient;

    public SessionClient() throws IOException {
        // Load the Google Cloud credentials
        InputStream credentialsStream = getClass().getClassLoader().getResourceAsStream("your_credentials_file_here.json");
        GoogleCredentials credentials = GoogleCredentials.fromStream(credentialsStream);

        // Create a SessionsClient instance with the loaded credentials
        sessionsClient = SessionsClient.create(SessionsSettings.newBuilder()
                .setCredentialsProvider(new CredentialsProvider() {
                    @Override
                    public Credentials getCredentials() throws IOException {
                        return credentials;
                    }
                })
                .build());
    }

    public String sendMessage(String message) {
        // Set the session name using the PROJECT_ID and SESSION_ID constants
        SessionName sessionName = SessionName.of(PROJECT_ID, SESSION_ID);

        // Create a TextInput instance with the user's message
        TextInput.Builder textInput = TextInput.newBuilder().setText(message).setLanguageCode(LANGUAGE_CODE);

        // Create a QueryInput instance with the TextInput
        QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();

        // Send the query to the ChatGPT API using the SessionsClient
        DetectIntentResponse response = sessionsClient.detectIntent(sessionName, queryInput);

        // Get the response message from the ChatGPT API
        QueryResult queryResult = response.getQueryResult();
        String responseText = queryResult.getFulfillmentText();

        // Return the response message
        return responseText;
    }

    public void close() throws Exception {
        // Close the SessionsClient instance
        sessionsClient.close();
    }
}
