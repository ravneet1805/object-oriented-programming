// Program to Compute Area of a Circle
// Problem Statement: Create a Circle class with an attribute radius. 
// Add methods to calculate and display the area and circumference of the circle.

public class Circle {
    double radius;
    
    // Constructor to initialize the circle's radius
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    // Method to display area and circumference details
    public void display() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
    }
    
    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.display();
    }
}
