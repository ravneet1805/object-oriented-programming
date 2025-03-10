// VehicleManagementHybrid.java
// Problem 11: Vehicle Management System with Hybrid Inheritance
interface Refuelable {
    void refuel();
}

class VehicleHybrid {
    int maxSpeed;
    String model;
    
    public VehicleHybrid(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    
    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends VehicleHybrid {
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    
    public void charge() {
        System.out.println("Electric vehicle " + model + " is charging.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Electric");
    }
}

class PetrolVehicle extends VehicleHybrid implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle " + model + " is refueling.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Petrol");
    }
}

public class VehicleManagementHybrid {
    public static void main(String[] args) {
        VehicleHybrid[] vehicles = new VehicleHybrid[2];
        vehicles[0] = new ElectricVehicle(180, "Tesla Model 3");
        vehicles[1] = new PetrolVehicle(200, "BMW 3 Series");
        
        for (VehicleHybrid v : vehicles) {
            v.displayInfo();
            if (v instanceof ElectricVehicle) {
                ((ElectricVehicle) v).charge();
            }
            if (v instanceof PetrolVehicle) {
                ((PetrolVehicle) v).refuel();
            }
            System.out.println();
        }
    }
}
