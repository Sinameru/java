
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HashMap Example ===");

        // Create a Map: key = Integer, value = String
        Map<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        // Duplicate key overwrites value
        map.put(2, "David");

        // Access elements
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2)); // "David"

        // Remove an element
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterate over keys
        System.out.println("Iterating over keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterate over values
        System.out.println("Iterating over values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // Iterate over key-value pairs
        System.out.println("Iterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Optional: LinkedHashMap example to preserve insertion order
        System.out.println("\n=== LinkedHashMap Example ===");
        Map<Integer, String> linkedMap = new java.util.LinkedHashMap<>();
        linkedMap.put(3, "Charlie");
        linkedMap.put(1, "Alice");
        linkedMap.put(2, "Bob");

        System.out.println("LinkedHashMap iteration preserves insertion order:");
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
