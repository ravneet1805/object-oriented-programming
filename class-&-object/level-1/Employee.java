// Program to Display Employee Details
// Problem Statement: Create an Employee class with attributes name, id, and salary. 
// Add a method to display the details.

public class Employee {
    String name;
    int id;
    double salary;
    
    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
    
    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", 1001, 55000.00);
        emp.displayDetails();
    }
}
