public class Main {
    public static void main(String[] args) {
        System.out.println("Program started.");

        try {
            System.out.println("Inside try block.");
            int result = 10 / 0; // triggers ArithmeticException
            System.out.println("This line will not execute.");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues after try-catch-finally.");

        // Example with no exception
        try {
            System.out.println("Try block without exception.");
            int result = 10 / 2; // safe operation
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        } finally {
            System.out.println("Finally still executes even when no exception.");
        }

        System.out.println("Program ended.");
    }
}
