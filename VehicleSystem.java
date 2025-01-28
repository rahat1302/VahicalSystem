// Abstract class demonstrating Abstraction
abstract class Vehicle {
    private String brand; // Encapsulation: private fields
    private int speed;

    // Constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getters and Setters for Encapsulation
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Abstract method
    public abstract void startEngine();

    // Polymorphism: Method to display information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Subclass demonstrating Inheritance
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclass demonstrating Inheritance
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void startEngine() {
        System.out.println("The bike's engine is starting...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class to test the system
public class VehicleSystem {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", 180, 4);
        car.startEngine();
        car.displayInfo();

        System.out.println();

        // Create a Bike object
        Bike bike = new Bike("Yamaha", 120, true);
        bike.startEngine();
        bike.displayInfo();
    }
}