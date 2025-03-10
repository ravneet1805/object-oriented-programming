// Employee.java
// Problem: Employee Records
// Create an Employee class with employeeID (public), department (protected), and salary (private).
// Provide public methods to modify salary.
// Create a subclass Manager to access employeeID and department.

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department : " + department);
        System.out.println("Salary     : $" + salary);
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    
    // Method to display manager details (accessing employeeID and department)
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department : " + department);
        System.out.println("Salary     : $" + getSalary());
    }
    
    public static void main(String[] args) {
        Manager mgr = new Manager(501, "Finance", 75000.00);
        mgr.displayManagerDetails();
    }
}
