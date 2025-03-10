// CompanyDepartments.java
// Problem 3: Company and Departments (Composition)
// A Company contains multiple Department objects, and each Department has Employee objects.
// The Department and Employee objects cannot exist independently of the Company.

import java.util.ArrayList;

class Employee {
    String name;
    int employeeId;
    
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    public void display() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name);
    }
}

class Department {
    String departmentName;
    private ArrayList<Employee> employees;
    
    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    
    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    // Composition: A Company "owns" its departments.
    private ArrayList<Department> departments;
    
    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }
    
    public void addDepartment(Department d) {
        departments.add(d);
    }
    
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
            System.out.println();
        }
    }
}

public class CompanyDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovators Inc.");
        
        Department deptIT = new Department("IT");
        deptIT.addEmployee(new Employee("John", 101));
        deptIT.addEmployee(new Employee("Jane", 102));
        
        Department deptHR = new Department("HR");
        deptHR.addEmployee(new Employee("Alice", 201));
        deptHR.addEmployee(new Employee("Bob", 202));
        
        company.addDepartment(deptIT);
        company.addDepartment(deptHR);
        
        // Display company details (composition ensures departments and employees are part of the company)
        company.displayCompanyDetails();
    }
}
