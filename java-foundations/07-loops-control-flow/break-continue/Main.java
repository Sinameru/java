
public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // Break example
        // ------------------------------
        System.out.println("=== Break Example ===");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // exits the loop immediately
            }
            System.out.println("i = " + i);
        }

        // ------------------------------
        // Continue example
        // ------------------------------
        System.out.println("\n=== Continue Example ===");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skipping i = " + i);
                continue; // skip current iteration
            }
            System.out.println("i = " + i);
        }

        // ------------------------------
        // Nested loop with break
        // ------------------------------
        System.out.println("\n=== Nested Loop with Break ===");

        outerLoop:
        for (int i = 1; i <= 3; i++) {
            innerLoop:
            for (int j = 1; j <= 3; j++) {
                System.out.println("i=" + i + ", j=" + j);
                if (i * j == 4) {
                    System.out.println("Breaking outer loop");
                    break outerLoop; // breaks labeled outer loop
                }
            }
        }

        // ------------------------------
        // Nested loop with continue
        // ------------------------------
        System.out.println("\n=== Nested Loop with Continue ===");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    System.out.println("Skipping j=" + j);
                    continue; // skips inner loop iteration
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
