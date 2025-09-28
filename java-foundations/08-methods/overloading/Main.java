public class Main {
    public static void main(String[] args) {
        // Using different versions of the multiply method
        System.out.println("multiply(int, int): " + multiply(2, 3));
        System.out.println("multiply(double, double): " + multiply(2.5, 3.5));
        System.out.println("multiply(int, int, int): " + multiply(2, 3, 4));
    }

    // ------------------------------
    // Overloaded methods
    // ------------------------------

    // Multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiply two doubles
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Multiply three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
