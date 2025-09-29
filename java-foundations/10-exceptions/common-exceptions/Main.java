import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // === Checked Exception Example ===
        // FileNotFoundException must be handled because the file might not exist
        try {
            Scanner fileScanner = new Scanner(new File("nonexistent.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception caught: File not found!");
        }

        // Checked Exception Example: IOException
        // Must handle or declare, demonstrates throwing a checked exception manually
        try {
            throw new java.io.IOException("IO problem");
        } catch (java.io.IOException e) {
            System.out.println("Checked exception caught: IO issue");
        }

        // === Unchecked Exception Examples ===
        // ArrayIndexOutOfBoundsException: accessing array outside its bounds
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception caught: Invalid array index");
        }

        // NullPointerException: calling method on a null reference
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Unchecked exception caught: Null reference");
        }

        // ArithmeticException: illegal arithmetic operation (division by zero)
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception caught: Division by zero");
        }

        // IllegalArgumentException: passing invalid argument to a method
        // Also demonstrates handling a checked exception (InterruptedException) required by sleep()
        try {
            Thread.sleep(-100); // negative sleep time triggers IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Unchecked exception caught: Illegal argument");
        } catch (InterruptedException e) {
            // required by Thread.sleep, but not triggered here
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
