import java.util.Scanner;

public class TestBoxEquality {
    public static void main(String[] args) {
        // sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Box dims");
        Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter 2nd Box dims");
        Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(b1.isEqual(b2) ? "Same Dims" : "Different Dims");
       
        System.out.println("Enter offsets from 1st Box");
        Box b3 = b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(b1.getBoxDims());
        System.out.println(b3.getBoxDims());
        sc.close();
    }
}
