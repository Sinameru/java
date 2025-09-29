import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // === Manual Boxing/Unboxing ===
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt); // manual boxing
        int unboxedInt = boxedInt.intValue();             // manual unboxing

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Boxed: " + boxedInt);
        System.out.println("Unboxed: " + unboxedInt);

        // === Autoboxing & Auto-unboxing ===
        Integer autoBoxed = primitiveInt; // compiler inserts Integer.valueOf(primitiveInt)
        int autoUnboxed = boxedInt;       // compiler inserts boxedInt.intValue()

        System.out.println("Autoboxed: " + autoBoxed);
        System.out.println("Auto-unboxed: " + autoUnboxed);

        // === Autoboxing in Collections ===
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // autoboxing
        numbers.add(20);
        numbers.add(30);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;   // auto-unboxing
        }

        System.out.println("Numbers in list: " + numbers);
        System.out.println("Sum: " + sum);

        // === Pitfall: equality check ===
        Integer a = 128;
        Integer b = 128;
        System.out.println("a == b? " + (a == b));        // false, different objects
        System.out.println("a.equals(b)? " + a.equals(b)); // true, compares values

        // === Performance note ===
        Long total = 0L;
        for (long i = 0; i < 5; i++) {  // small example; avoid autoboxing in large loops
            total += i;                 // auto-unboxing/boxing each iteration
        }
        System.out.println("Total: " + total);

        // === Wrapper utility methods ===
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        double parsedDouble = Double.parseDouble("3.14");

        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);
        System.out.println("Integer max: " + Integer.MAX_VALUE);
        System.out.println("Integer min: " + Integer.MIN_VALUE);
    }
}