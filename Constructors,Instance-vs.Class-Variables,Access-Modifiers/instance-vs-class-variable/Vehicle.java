// Vehicle.java
// Problem: Vehicle Registration
// Create a Vehicle class with instance variables: ownerName, vehicleType;
// a class variable: registrationFee; an instance method displayVehicleDetails();
// and a class method updateRegistrationFee().

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;
    
    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }
    
    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Sedan");
        v1.displayVehicleDetails();
        System.out.println();
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v2 = new Vehicle("Bob", "SUV");
        v2.displayVehicleDetails();
    }
}
