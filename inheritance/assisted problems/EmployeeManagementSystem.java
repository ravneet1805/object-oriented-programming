// EmployeeManagementSystem.java
// Problem 2: Employee Management System
// Base class Employee with attributes name, id, salary, and method displayDetails().
// Manager (with teamSize), Developer (with programmingLanguage), and Intern (with internshipDuration)
// override displayDetails() to display extra information.

class Employee {
    String name;
    int id;
    double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : $" + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size  : " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration; // in months
    
    public Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 1001, 50000);
        Manager m = new Manager("Bob", 1002, 80000, 10);
        Developer d = new Developer("Charlie", 1003, 70000, "Java");
        Intern i = new Intern("Dave", 1004, 15000, 6);
        
        System.out.println("----Employee----");
        e.displayDetails();
        System.out.println("\n----Manager----");
        m.displayDetails();
        System.out.println("\n----Developer----");
        d.displayDetails();
        System.out.println("\n----Intern----");
        i.displayDetails();
    }
}
