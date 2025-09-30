public class Main {
    public static void main(String[] args) {
        // === Basic printing ===
        System.out.print("This prints without a newline. ");
        System.out.print("Still the same line.\n"); // adding \n manually

        System.out.println("This prints with a newline.");
        System.out.println("Next line starts here.");

        // === Printing variables ===
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age);

        // === Formatted output ===
        double pi = 3.14159;
        System.out.printf("Formatted Pi: %.2f%n", pi); // prints 2 decimal places

        // === Escape characters ===
        System.out.println("Quotes: \"Hello World\"");
        System.out.println("Tab:\tIndented text");
        System.out.println("Backslash: \\");
    }
}
