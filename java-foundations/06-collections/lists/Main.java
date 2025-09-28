
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ------------------------------
        // ArrayList example
        // ------------------------------
        System.out.println("=== ArrayList ===");
        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        arrayList.add("Java"); // duplicates allowed

        // Accessing elements
        System.out.println("First element: " + arrayList.get(0));
        System.out.println("All elements (for loop):");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Iterating with for-each
        System.out.println("All elements (for-each):");
        for (String lang : arrayList) {
            System.out.println(lang);
        }

        // Removing an element
        arrayList.remove("Python");
        System.out.println("After removing Python: " + arrayList);

        // ------------------------------
        // LinkedList example
        // ------------------------------
        System.out.println("\n=== LinkedList ===");
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add(10);
        linkedList.add(30);
        linkedList.add(30);

        System.out.println("Original LinkedList: " + linkedList);

        // Adding element at a specific position
        linkedList.add(1, 15); // insert 15 at index 1
        linkedList.add(1, 16); // insert 16 at index 1
        linkedList.add(1, 13); // insert 13 at index 1
        linkedList.add(1, 14); // insert 14 at index 1

        System.out.println("After inserting 15 at index 1: " + linkedList);

        // Removing element by index
        linkedList.remove(2); // removes element at index 2
        System.out.println("After removing element at index 2: " + linkedList);

        // Accessing elements
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Iterating using for-each
        System.out.println("LinkedList elements:");
        for (int num : linkedList) {
            System.out.println(num);
        }
    }
}
