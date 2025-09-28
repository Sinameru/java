public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // For loop
        // ------------------------------
        System.out.println("=== For Loop ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // ------------------------------
        // While loop
        // ------------------------------
        System.out.println("\n=== While Loop ===");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // ------------------------------
        // Do-While loop
        // ------------------------------
        System.out.println("\n=== Do-While Loop ===");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // ------------------------------
        // Example: sum using loops
        // ------------------------------
        System.out.println("\n=== Sum of first 5 numbers using For Loop ===");
        int sum = 0;
        for (int n = 1; n <= 5; n++) {
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}
