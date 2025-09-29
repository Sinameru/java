import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // === Reading an integer ===
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // === Reading a double ===
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // === Reading a single word (String) ===
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        // === Reading a whole line (String) ===
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter a full line: ");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);

        // === Reading boolean ===
        System.out.print("Enter true/false: ");
        boolean flag = scanner.nextBoolean();
        System.out.println("You entered: " + flag);

        // Close the scanner
        scanner.close();
    }
}
