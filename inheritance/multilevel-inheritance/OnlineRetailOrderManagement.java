// OnlineRetailOrderManagement.java
// Problem 6: Online Retail Order Management (Multilevel Inheritance)
import java.util.Date;

class Order {
    int orderId;
    Date orderDate;
    
    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    
    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    
    public ShippedOrder(int orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    
    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;
    
    public DeliveredOrder(int orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    
    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(1001, new Date());
        ShippedOrder shipped = new ShippedOrder(1002, new Date(), "TRACK123");
        DeliveredOrder delivered = new DeliveredOrder(1003, new Date(), "TRACK456", new Date());
        
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Order Status: " + shipped.getOrderStatus());
        System.out.println("Order Status: " + delivered.getOrderStatus());
    }
}
