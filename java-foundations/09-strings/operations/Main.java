public class Main {
    public static void main(String[] args) {
        String str = "  Hello, Java!  ";

        // ------------------------------
        // Length
        // ------------------------------
        System.out.println("Length of str: " + str.length());

        // ------------------------------
        // charAt
        // ------------------------------
        System.out.println("Character at index 7: " + str.charAt(7));

        // ------------------------------
        // substring
        // ------------------------------
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        // ------------------------------
        // equals and compareTo
        // ------------------------------
        String str1 = "Java";
        String str2 = "java";
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));

        // ------------------------------
        // toUpperCase and toLowerCase
        // ------------------------------
        System.out.println("Upper case: " + str.toUpperCase());
        System.out.println("Lower case: " + str.toLowerCase());

        // ------------------------------
        // trim
        // ------------------------------
        System.out.println("Trimmed string: '" + str.trim() + "'");

        // ------------------------------
        // replace
        // ------------------------------
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));

        // ------------------------------
        // Concatenation
        // ------------------------------
        String greeting = str1 + " " + str2;
        System.out.println("Concatenated: " + greeting);
    }
}
