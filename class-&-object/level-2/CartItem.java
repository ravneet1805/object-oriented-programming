
// 5. Create a CartItem class with attributes itemName, price, and quantity.
// Add methods to:
//   - Add an item to the cart.
//   - Remove an item from the cart.
//   - Display the total cost.

import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;
    
    // Constructor to initialize a cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Method to add an item (increase quantity)
    public void addItem(int additionalQuantity) {
        if(additionalQuantity > 0) {
            this.quantity += additionalQuantity;
            System.out.println(additionalQuantity + " units added to " + itemName + ". New quantity: " + quantity);
        } else {
            System.out.println("Invalid quantity to add.");
        }
    }
    
    // Method to remove an item (reduce quantity)
    public void removeItem(int removeQuantity) {
        if(removeQuantity > 0 && removeQuantity <= this.quantity) {
            this.quantity -= removeQuantity;
            System.out.println(removeQuantity + " units removed from " + itemName + ". New quantity: " + quantity);
        } else {
            System.out.println("Invalid removal quantity.");
        }
    }
    
    // Method to display the total cost (price * quantity)
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total cost for " + itemName + ": $" + totalCost);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String name = in.next();
        System.out.print("Enter price: ");
        double price = in.nextDouble();
        System.out.print("Enter initial quantity: ");
        int quantity = in.nextInt();
        
        CartItem item = new CartItem(name, price, quantity);
        item.displayTotalCost();
        
        System.out.print("Enter quantity to add: ");
        int addQty = in.nextInt();
        item.addItem(addQty);
        item.displayTotalCost();
        
        System.out.print("Enter quantity to remove: ");
        int removeQty = in.nextInt();
        item.removeItem(removeQty);
        item.displayTotalCost();
    }
}
