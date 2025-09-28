public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // If-Else Example
        // ------------------------------
        System.out.println("=== If-Else Example ===");
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // ------------------------------
        // Nested If Example
        // ------------------------------
        int a = 5, b = 8;
        if (a > 0) {
            if (b > 0) {
                System.out.println("Both a and b are positive");
            }
        }

        // ------------------------------
        // Switch Example
        // ------------------------------
        System.out.println("\n=== Switch Example ===");
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend or invalid day");
        }

        // ------------------------------
        // Switch with Strings
        // ------------------------------
        System.out.println("\n=== Switch with String Example ===");
        String fruit = "Apple";

        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
