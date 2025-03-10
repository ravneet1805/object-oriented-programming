// Student.java
// Problem: University Management System
// Create a Student class with rollNumber (public), name (protected), and CGPA (private).
// Provide public methods to access and modify CGPA.
// Create a subclass PostgraduateStudent to demonstrate protected member access.

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    // Public getter and setter for CGPA
    public double getCGPA() {
        return CGPA;
    }
    
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    
    // Method to display postgraduate student details.
    public void displayPGDetails() {
        // Accessing protected name directly.
        System.out.println("Postgraduate Student:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + getCGPA());
    }
    
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Emma", 8.75);
        pgStudent.displayPGDetails();
    }
}
