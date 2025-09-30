public class Car {
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;   // 'this' distinguishes field from parameter
        this.model = model;
        this.year = year;
    }

    // Instance method to display info
    public void showInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
    }
}
