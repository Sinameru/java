public class Main {

    // Instance variable
    String instanceVar = "I am an instance variable";

    // Static variable
    static int staticVar = 0;

    // Constant (final variable)
    final double PI = 3.14159;
    final String exemple;

    // Constructor to show shadowing
    public Main(String instanceVar, String exemple) {
        // "this.instanceVar" refers to the field,
        // "instanceVar" refers to the parameter
        this.instanceVar = instanceVar;
        this.exemple = exemple;
    }

    // Constructor overload where exemple is not used
    public Main(String instanceVar) {
        this.instanceVar = instanceVar;
        this.exemple = null;
    }

    // Method to demonstrate local variable
    public void showLocalVar() {
        int localVar = 42; // local variable
        System.out.println("Local variable: " + localVar);
    }

    // Method to demonstrate instance variable
    public void showInstanceVar() {
        System.out.println("Instance variable: " + instanceVar);
    }

    // Method to demonstrate String example
    public void showStringExample() {
        System.out.println("String Example: " + exemple);
    }

    // Method to increment static variable
    public void incrementStaticVar() {
        staticVar++;
    }

    // Method to show constant
    public void showConstant() {
        System.out.println("Constant PI: " + PI);
    }

    public static void main(String[] args) {
        // Local variable inside main
        int x = 10;
        System.out.printf("Main local variable: %d\n\n", x);

        // Create first object
        Main obj1 = new Main("First Object", "First Example");
        obj1.showLocalVar();
        obj1.showInstanceVar();
        obj1.showStringExample();
        obj1.showConstant();
        obj1.incrementStaticVar();

        System.out.println("--------------------------------------------");

        // Create second object
        Main obj2 = new Main("Second Object");
        obj2.showLocalVar();
        obj2.showInstanceVar();
        obj2.showStringExample();
        obj2.showConstant();
        obj2.incrementStaticVar();

        // Show static variable (shared across objects)
        System.out.printf("\nStatic variable (shared): %d", Main.staticVar);
    }
}
