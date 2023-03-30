// This is the Vehicle class
 class Vehicle {
    // These are the attributes of the Vehicle class
		String brand;
		String model;
		int year;

    // This is the constructor of the Vehicle class
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // This is the drive method of the Vehicle class
    public void drive() {
        System.out.println("Driving the vehicle...");
    }
}

// This is the Car class, which extends the Vehicle class
 class Car extends Vehicle {
    // This is the additional attribute of the Car class
     String color;

    // This is the constructor of the Car class
    public Car(String brand, String model, int year, String color) {
        // This calls the constructor of the parent class (Vehicle) to initialize its attributes
        super(brand, model, year);
        // This initializes the color attribute of the Car class
        this.color = color;
    }

    // This is the type method of the Car class
    public void type() {
        System.out.println("This is a car.");
    }
}

// This is the main class
public class Main {
    // This is the main method
    public static void main(String[] args) {
        // This creates an object of the Car class
        Car car = new Car("Toyota", "Camry", 2022, "Red");
        // This calls the drive method inherited from the Vehicle class
        car.drive();
        // This calls the type method specific to the Car class
        car.type();
    }
}
