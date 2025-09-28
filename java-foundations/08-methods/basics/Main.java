public class Main {
    public static void main(String[] args) {
        // Calling a method that returns a value
        int sum = add(5, 10);
        System.out.println("Sum = " + sum);

        // Calling a method that prints directly
        greet("Alice");

        // Calling a method with no parameters
        printSeparator();
    }

    // ------------------------------
    // Method that returns an int
    // ------------------------------
    public static int add(int a, int b) {
        return a + b;
    }

    // ------------------------------
    // Method that prints a greeting
    // ------------------------------
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // ------------------------------
    // Method with no parameters and no return
    // ------------------------------
    public static void printSeparator() {
        System.out.println("----------------------");
    }
}
