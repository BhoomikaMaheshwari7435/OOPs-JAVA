class Vehicle {

    protected String vehicleNumber, brand, fuelType;

    Vehicle(String v, String b, String f) {
        vehicleNumber = v;
        brand = b;
        fuelType = f;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String v, String b, String f, int seats, boolean ac) {
        super(v, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {

    double batteryCapacity;
    double chargingTime;

    ElectricCar(String v, String b, String f, int seats, boolean ac, double bc, double ct) {
        super(v, b, f, seats, ac);
        batteryCapacity = bc;
        chargingTime = ct;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}

public class Practical25 {
    public static void main(String[] args) {
		
		System.out.print("\nBhoomika Maheshwari");
		System.out.println("\nEnrollment Number: 240390107020\n");
		
        Vehicle v = new Vehicle("V101", "Tata", "Petrol");
        Car c = new Car("C202", "Hyundai", "Diesel", 5, true);
        ElectricCar e = new ElectricCar("E303", "Tesla", "Electric", 5, true, 75, 1.5);

        System.out.println("\nVehicle:");
        v.displayDetails();

        System.out.println("\nCar:");
        c.displayDetails();

        System.out.println("\nElectric Car:");
        e.displayDetails();

        Vehicle v2 = new Car("C404", "Honda", "Petrol", 4, true);

        System.out.println("\nUpcasting Example:");
        v2.displayDetails();

        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Downcasting Successful, Seats: " + c2.numberOfSeats);
        }
    }
}