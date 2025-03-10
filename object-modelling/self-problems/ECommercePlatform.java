// ECommercePlatform.java
// Problem 4: E-commerce Platform with Orders, Customers, and Products
import java.util.ArrayList;

class Product {
    String productName;
    double price;
    
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    
    public void display() {
        System.out.println(productName + " ($" + price + ")");
    }
}

class Order {
    int orderId;
    private ArrayList<Product> products;
    
    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }
    
    public void addProduct(Product p) {
        products.add(p);
    }
    
    public double calculateTotal() {
        double total = 0.0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
    
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product p : products) {
            p.display();
        }
        System.out.printf("Total Cost: $%.2f\n", calculateTotal());
    }
}

class Customer {
    String name;
    // A customer can place multiple orders.
    private ArrayList<Order> orders;
    
    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }
    
    // Place an order and return it.
    public Order placeOrder(int orderId) {
        Order order = new Order(orderId);
        orders.add(order);
        return order;
    }
    
    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.displayOrder();
            System.out.println();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create some products
        Product prod1 = new Product("Laptop", 899.99);
        Product prod2 = new Product("Smartphone", 499.99);
        Product prod3 = new Product("Headphones", 89.99);
        
        // Create a customer
        Customer customer = new Customer("Alice");
        
        // Customer places an order
        Order order1 = customer.placeOrder(1001);
        order1.addProduct(prod1);
        order1.addProduct(prod3);
        
        // Customer places another order
        Order order2 = customer.placeOrder(1002);
        order2.addProduct(prod2);
        
        // Display customer's orders
        customer.displayOrders();
    }
}
