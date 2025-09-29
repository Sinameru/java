public class Main {

    // === Static variable ===
    static int staticCount = 0; // belongs to the class, shared by all objects

    // === Instance variable ===
    int instanceCount = 0; // belongs to each object individually

    // Constructor
    Main() {
        staticCount++;    // increments shared counter
        instanceCount++;  // increments this object's counter
    }

    // === Static method ===
    static void showStaticCount() {
        System.out.println("Static count (shared): " + staticCount);
        // Cannot access instanceCount directly here! Uncommenting next line would cause error:
        // System.out.println(instanceCount);
    }

    // === Instance method ===
    void showInstanceCount() {
        System.out.println("Instance count (this object): " + instanceCount);
        System.out.println("Access static from instance: " + staticCount);
    }

    public static void main(String[] args) {
        System.out.println("Initial static count: " + staticCount);

        Main obj1 = new Main();
        Main obj2 = new Main();

        System.out.println("\n--- Using static method ---");
        Main.showStaticCount();  // Access class-level data

        System.out.println("\n--- Using instance methods ---");
        obj1.showInstanceCount(); // Access object-level and static data
        obj2.showInstanceCount();

        System.out.println("\n--- Direct access ---");
        System.out.println("Static count via class: " + Main.staticCount);
        System.out.println("Instance count obj1: " + obj1.instanceCount);
        System.out.println("Instance count obj2: " + obj2.instanceCount);
    }
}

