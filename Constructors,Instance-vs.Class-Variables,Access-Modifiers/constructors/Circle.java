// Circle.java
// Problem: Write a Circle class with a radius attribute.
// Use constructor chaining to initialize radius with default and user-provided values.

public class Circle {
    double radius;
    
    // Default constructor sets a default radius
    public Circle() {
        this(1.0); // calls parameterized constructor with radius = 1.0
    }
    
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate and display area and circumference
    public void display() {
        System.out.println("Circle Details:");
        System.out.println("Radius         : " + radius);
        System.out.printf("Area           : %.2f\n", Math.PI * radius * radius);
        System.out.printf("Circumference  : %.2f\n", 2 * Math.PI * radius);
    }
    
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0);
        defaultCircle.display();
        System.out.println();
        customCircle.display();
    }
}
