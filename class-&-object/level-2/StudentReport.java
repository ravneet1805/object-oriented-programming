//1 . Create a Student class with attributes name, rollNumber, and marks.
// Add two methods:
//   1. To calculate the grade based on the marks.
//   2. To display the student's details and grade.

import java.util.Scanner;

public class StudentReport {
    // Attributes
    String name;
    int rollNumber;
    double marks;
    
    // Constructor to initialize student details
    public StudentReport(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    // Method to calculate the grade based on marks
    public String calculateGrade() {
        if(marks >= 90)
            return "A";
        else if(marks >= 80)
            return "B";
        else if(marks >= 70)
            return "C";
        else if(marks >= 60)
            return "D";
        else
            return "F";
    }
    
    // Method to display student details and grade
    public void displayReport() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = in.next();
        System.out.print("Enter roll number: ");
        int roll = in.nextInt();
        System.out.print("Enter marks: ");
        double marks = in.nextDouble();
        StudentReport student = new StudentReport(name, roll, marks);
        student.displayReport();
    }
}
