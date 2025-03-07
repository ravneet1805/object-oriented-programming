// Program to Handle Mobile Phone Details
// Problem Statement: Create a MobilePhone class with attributes brand, model, and price. 
// Add a method to display all the details of the phone.

public class MobilePhone {
    String brand;
    String model;
    double price;
    
    // Constructor to initialize mobile phone details
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    
    // Main method to test the MobilePhone class
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 13", 999.99);
        phone.displayDetails();
    }
}
