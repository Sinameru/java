public class Main {
    public static void main(String[] args) {
        // Create an Animal
        Animal generic = new Animal("GenericAnimal");
        generic.makeSound();

        // Create a Dog
        Dog dog = new Dog("Rex", "German Shepherd");
        dog.makeSound();      // overridden method
        dog.showBreed();      // specific method

        // Polymorphism
        Animal pet = new Dog("Buddy", "Beagle");
        pet.makeSound();      // calls Dog's overridden method
        // pet.showBreed();   // ERROR: Animal reference cannot call Dog-specific method

        Fish fish = new Fish("Fishhhhh", "White");
        fish.makeSound();     // overridden method
        fish.showColor();     // specific method
    }
}
