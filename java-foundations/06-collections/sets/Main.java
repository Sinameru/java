import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate, ignored

        System.out.println("Set elements: " + set);

        // Check for existence
        if (set.contains("Banana")) {
            System.out.println("Banana is in the set");
        }

        // Iterate over elements
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}