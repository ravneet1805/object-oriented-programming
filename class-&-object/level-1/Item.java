// Program to Track Inventory of Items
// Problem Statement: Create an Item class with attributes itemCode, itemName, and price. 
// Add a method to display item details and calculate the total cost for a given quantity.

public class Item {
    String itemCode;
    String itemName;
    double price;
    
    // Constructor to initialize item details
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    
    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }
    
    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    
    // Main method to test the Item class
    public static void main(String[] args) {
        Item item = new Item("IT1001", "Laptop", 750.00);
        item.displayDetails();
        int quantity = 3;
        System.out.println("Total cost for " + quantity + " units: $" + item.calculateTotalCost(quantity));
    }
}
