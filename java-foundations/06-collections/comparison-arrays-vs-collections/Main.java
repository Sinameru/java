
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // Arrays
        // ------------------------------
        System.out.println("=== Arrays ===");

        // Arrays have fixed size
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println("Array length: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Trying to add more than 3 elements would cause an error
        // numbers[3] = 40; // ArrayIndexOutOfBoundsException

        // ------------------------------
        // Collections (ArrayList example)
        // ------------------------------
        System.out.println("\n=== Collections (ArrayList) ===");

        // ArrayList can grow dynamically
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); // no problem, grows automatically

        System.out.println("List size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }

        // Collections only store objects, not primitives
        // That's why we use Integer (wrapper for int)
        list.add(50);
        System.out.println("After adding 50, list = " + list);
    }
}
