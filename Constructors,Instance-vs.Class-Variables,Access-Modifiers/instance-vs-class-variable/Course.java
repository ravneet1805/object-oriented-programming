// Course.java
// Problem: Online Course Management
// Design a Course class with instance variables: courseName, duration, fee; 
// a class variable instituteName; an instance method displayCourseDetails();
// and a class method updateInstituteName().

public class Course {
    String courseName;
    int duration; // in weeks
    double fee;
    static String instituteName = "Default Institute";
    
    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    
    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name  : " + courseName);
        System.out.println("Duration (wks): " + duration);
        System.out.println("Fee          : $" + fee);
        System.out.println("Institute    : " + instituteName);
    }
    
    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 12, 299.99);
        course1.displayCourseDetails();
        System.out.println();
        Course.updateInstituteName("Tech Academy");
        Course course2 = new Course("Python Programming", 10, 249.99);
        course2.displayCourseDetails();
    }
}
