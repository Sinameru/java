public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // String Declaration
        // ------------------------------
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // ------------------------------
        // String Assignment
        // ------------------------------
        String greeting = str1 + " " + str2;
        System.out.println("Greeting = " + greeting);

        // ------------------------------
        // Comparing Strings
        // ------------------------------
        String str3 = "Hello";
        System.out.println("str1 == str3? " + (str1 == str3));         // compares references
        System.out.println("str1.equals(str3)? " + str1.equals(str3)); // compares content

        // ------------------------------
        // String Concatenation
        // ------------------------------
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Combined using concat() = " + combined);
    }
}
