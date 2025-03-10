// VehicleTransportSystem.java
// Problem 3: Vehicle and Transport System
// Superclass Vehicle with attributes maxSpeed and fuelType, and method displayInfo().
// Subclasses Car (seatCapacity), Truck (cargoCapacity), and Motorcycle (hasABS) override displayInfo().

class Vehicle {
    int maxSpeed;
    String fuelType;
    
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;
    
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double cargoCapacity; // in tons
    
    public Truck(int maxSpeed, String fuelType, double cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasABS;
    
    public Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has ABS: " + (hasABS ? "Yes" : "No"));
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(200, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(180, "Petrol", true);
        
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-------------------");
        }
    }
}
