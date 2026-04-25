abstract class Vehicle {

    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {

    String fuelType() {
        return "Petrol/Diesel";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class Practical30 {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Car:");
        System.out.println("Fuel: " + v1.fuelType());
        System.out.println("Wheels: " + v1.noOfWheels());

        System.out.println("\nBike:");
        System.out.println("Fuel: " + v2.fuelType());
        System.out.println("Wheels: " + v2.noOfWheels());
    }
}