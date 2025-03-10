// CarRental.java
// Problem: Create a CarRental class with attributes customerName, carModel, and rentalDays.
// Add constructors to initialize the rental details and calculate total cost.

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay;
    
    // Default constructor with default values
    public CarRental() {
        this("Unknown", "Standard Model", 1, 50.0); // default: 1 day at $50 per day
    }
    
    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double ratePerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.ratePerDay = ratePerDay;
    }
    
    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }
    
    // Method to display rental details
    public void displayDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Rate per Day : $" + ratePerDay);
        System.out.println("Total Cost   : $" + calculateTotalCost());
    }
    
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Bob Smith", "Toyota Camry", 5, 70.0);
        defaultRental.displayDetails();
        System.out.println();
        customRental.displayDetails();
    }
}
