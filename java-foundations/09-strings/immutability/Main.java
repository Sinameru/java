public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // Original String
        // ------------------------------
        String original = "Hello";
        System.out.println("Original: " + original);

        // ------------------------------
        // Attempt to modify the String
        // ------------------------------
        String modified = original.concat(" World"); // creates a new String object
        System.out.println("Modified: " + modified);
        System.out.println("Original after modification: " + original); // unchanged

        // ------------------------------
        // Using replace (also creates new String)
        // ------------------------------
        String replaced = original.replace('H', 'J');
        System.out.println("Replaced: " + replaced);
        System.out.println("Original after replace: " + original); // still unchanged

        // ------------------------------
        // Demonstrating reference behavior
        // ------------------------------
        String s1 = "Hello";
        String s2 = s1;
        s2 = s2 + " Java"; // new object created, s1 remains unchanged
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
