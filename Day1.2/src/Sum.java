class Sum {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]); //public static int parseInt(String s) throws NumberFormatException
        int num2 = Integer.parseInt(args[1]); //static method in "class Integer"
        System.out.println("Result : " + (num1 + num2));
    }
}
