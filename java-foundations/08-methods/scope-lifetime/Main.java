public class Main {
    // ------------------------------
    // Static variable (class-level)
    // ------------------------------
    static int staticCounter = 0;

    // ------------------------------
    // Instance variable (object-level)
    // ------------------------------
    int instanceCounter = 0;

    public static void main(String[] args) {
        Main obj1 = new Main();
        Main obj2 = new Main();

        System.out.println("=== Using obj1 ===");
        obj1.increment();
        obj1.increment();

        System.out.println("\n=== Using obj2 ===");
        obj2.increment();

        System.out.println("\n=== Accessing static variable directly ===");
        System.out.println("Static counter = " + staticCounter);
    }

    // ------------------------------
    // Method demonstrating local variables
    // ------------------------------
    public void increment() {
        // Local variable (scope limited to this method)
        int localCounter = 0;

        localCounter++;
        instanceCounter++;
        staticCounter++;

        System.out.println("Local counter = " + localCounter);
        System.out.println("Instance counter = " + instanceCounter);
        System.out.println("Static counter = " + staticCounter);
    }
}

