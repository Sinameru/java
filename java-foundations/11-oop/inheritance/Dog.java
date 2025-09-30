public class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String name, String breed) {
        super(name);  // call parent constructor
        this.breed = breed;
    }

    // Overriding method
    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }

    // New method specific to Dog
    public void showBreed() {
        System.out.println(name + "'s breed: " + breed);
    }
}
