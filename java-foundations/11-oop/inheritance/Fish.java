public class Fish extends Animal {
    String color;

    // Constructor
    public Fish(String name, String color) {
        super(name);  // call parent constructor
        this.color = color;
    }

    // Overriding method
    @Override
    public void makeSound() {
        System.out.println(name + " hums");
    }

    // New method specific to Fish
    public void showColor() {
        System.out.println(name + "'s color: " + this.color);
    }
}
