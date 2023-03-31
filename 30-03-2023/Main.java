									// This is the Vehicle class
 class Vehicle {
						// These are the attributes of the Vehicle class
		String brand;
		String model;
		int year;

								// This is the drive method of the Vehicle class
     public void drive() {
        System.out.println("Driving the vehicle...");
    }
}

															// This is the Car class, which extends the Vehicle class
 class Car extends Vehicle {
										
     String color;

     public void type() {
        System.out.println("This is a car.");
    }
	
}


												// This is the main class
 class Main01 {
																// This is the main method
    public static void main(String[] args) {
																// This creates an object of the Car class
        Car car = new Car();
		
		car.brand = "Toyota";
		car.model = "Camry";
		car.year = 2021;
		car.color = "Red";	
										
        car.drive();
																					
        car.type();
		
		
    }
}
