public class Main {
    public static void main(String[] args) {
        // 1. Widening Conversion (Implicit Casting)
        int x = 10;
        double y = x; // int automatically converts to double
        System.out.printf("int: %d -> double: %.2f%n", x, y);

        // 2. Narrowing Conversion (Explicit Casting)
        double d = 9.78;
        int i = (int) d; // explicit cast
        System.out.printf("double: %.2f -> int: %d%n", d, i);

        // 3. Primitive Conversion Rules
        char c = 'A';
        int code = c; // Unicode of 'A' is 65
        System.out.printf("char: %c -> int: %d%n", c, code);

        int big = 130;
        byte small = (byte) big; // overflow happens
        System.out.printf("int: %d -> byte: %d%n", big, small);

        // 4. Wrapper Classes & Parsing (Bonus)
        String s = "123";
        int num = Integer.parseInt(s); // String -> int
        double val = Double.valueOf("3.14"); // String -> double
        System.out.printf("num: %d, val: %.2f%n", num, val);
    }
}