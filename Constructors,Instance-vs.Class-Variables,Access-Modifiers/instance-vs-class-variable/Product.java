// Product.java
// Problem: Product Inventory
// Create a Product class with instance variables: productName, price; 
// and a class variable: totalProducts (shared among all products).
// Include an instance method displayProductDetails() and a class method displayTotalProducts().

public class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    
    // Parameterized constructor increases totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    
    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : $" + price);
    }
    
    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 899.99);
        Product p2 = new Product("Smartphone", 499.99);
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        Product.displayTotalProducts();
    }
}
