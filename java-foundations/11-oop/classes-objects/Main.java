public class Main {
    public static void main(String[] args) {
        // Create first object
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 25;
        person1.greet();

        // Create second object
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;
        person2.greet();

        // Each object has its own copy of instance variables
        System.out.println(person1.name + " and " + person2.name + " are different objects.");
    }
}
