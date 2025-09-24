public class Main {
    public static void main(String[] args) {
        // ---------------------------
        // Arithmetic Operators: + - * / %
        // ---------------------------
        int a = 10, b = 3;

        int sum = a + b;
        System.out.printf("Addition: %d + %d = %d\n", a, b, sum);

        int sub = a - b;
        System.out.printf("Subtraction: %d - %d = %d\n", a, b, sub);

        int mul = a * b;
        System.out.printf("Multiplication: %d * %d = %d\n", a, b, mul);

        int div = a / b;
        System.out.printf("Integer division: %d / %d = %d\n", a, b, div);

        int mod = a % b;
        System.out.printf("Remainder: %d %% %d = %d\n", a, b, mod);

        // ---------------------------
        // Relational Operators: == != > < >= <=
        // ---------------------------
        int x = 5, y = 8;

        System.out.printf("x == y? %b\n", x == y);
        System.out.printf("x != y? %b\n", x != y);
        System.out.printf("x > y? %b\n", x > y);
        System.out.printf("x < y? %b\n", x < y);
        System.out.printf("x >= y? %b\n", x >= y);
        System.out.printf("x <= y? %b\n", x <= y);

        // ---------------------------
        // Logical Operators: && || !
        // ---------------------------
        boolean p = true, q = false;

        System.out.printf("p && q = %b\n", p && q); // AND
        System.out.printf("p || q = %b\n", p || q); // OR
        System.out.printf("!p = %b\n", !p);         // NOT

        // ---------------------------
        // Assignment Operators: = += -= *= /= %=
        // ---------------------------
        int n = 10;
        System.out.printf("n = %d\n", n);

        n += 5;
        System.out.printf("n += 5 -> %d\n", n);

        n *= 2;
        System.out.printf("n *= 2 -> %d\n", n);

        n /= 3;
        System.out.printf("n /= 3 -> %d\n", n);

        n %= 4;
        System.out.printf("n %%= 4 -> %d\n", n);

        // ---------------------------
        // Unary Operators: ++ -- + -
        // ---------------------------
        int i = 7;
        System.out.printf("i = %d\n", i);
        System.out.printf("i++ = %d\n", i++); // post-increment
        System.out.printf("++i = %d\n", ++i); // pre-increment
        System.out.printf("--i = %d\n", --i); // pre-decrement
        System.out.printf("-i = %d\n", -i);   // negative sign

        // ---------------------------
        // Ternary Operator: condition ? value1 : value2
        // ---------------------------
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.printf("Age: %d, Status: %s\n", age, status);
    }
}
