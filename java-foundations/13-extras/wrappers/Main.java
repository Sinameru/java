import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // === Creating wrapper objects ===
        Integer boxedInt = Integer.valueOf(42);     // wrapping int
        Double boxedDouble = Double.valueOf(3.14);  // wrapping double
        Character boxedChar = Character.valueOf('c'); // wrapping char
        Boolean boxedBool = Boolean.valueOf(true);    // wrapping boolean

        System.out.println("Integer: " + boxedInt);
        System.out.println("Double: " + boxedDouble);
        System.out.println("Character: " + boxedChar);
        System.out.println("Boolean: " + boxedBool);

        // === Converting String to primitive using wrappers ===
        String intStr = "123";
        int parsedInt = Integer.parseInt(intStr);
        double parsedDouble = Double.parseDouble("2.718");

        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Parsed double: " + parsedDouble);

        // === Useful constants ===
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE);

        // === Wrappers in Collections ===
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // autoboxing happens here
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers in list: " + numbers);
    }
}