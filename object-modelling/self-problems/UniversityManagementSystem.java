// UniversityManagementSystem.java
// Problem 5: University Management System
import java.util.ArrayList;

class CourseUMS {
    String courseName;
    Professor professor; // the professor teaching the course
    private ArrayList<StudentUMS> enrolledStudents;
    
    public CourseUMS(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }
    
    // Enroll a student in the course
    public void enrollStudent(StudentUMS student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
    
    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }
    
    public void displayCourse() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.name);
        } else {
            System.out.println("No professor assigned.");
        }
        System.out.println("Enrolled Students:");
        for (StudentUMS s : enrolledStudents) {
            System.out.println(" - " + s.name);
        }
    }
}

class StudentUMS {
    String name;
    private ArrayList<CourseUMS> courses;
    
    public StudentUMS(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    
    // Enroll in a course
    public void enrollCourse(CourseUMS course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);
        }
    }
    
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (CourseUMS c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

class Professor {
    String name;
    private ArrayList<CourseUMS> coursesTeaching;
    
    public Professor(String name) {
        this.name = name;
        coursesTeaching = new ArrayList<>();
    }
    
    // Add a course to the list of courses taught
    public void addCourse(CourseUMS course) {
        if (!coursesTeaching.contains(course)) {
            coursesTeaching.add(course);
        }
    }
    
    public void displayCoursesTeaching() {
        System.out.println("Professor: " + name);
        System.out.println("Courses Teaching:");
        for (CourseUMS c : coursesTeaching) {
            System.out.println(" - " + c.courseName);
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create courses
        CourseUMS math = new CourseUMS("Mathematics");
        CourseUMS physics = new CourseUMS("Physics");
        
        // Create students
        StudentUMS student1 = new StudentUMS("Alice");
        StudentUMS student2 = new StudentUMS("Bob");
        
        // Create professor
        Professor profSmith = new Professor("Prof. Smith");
        
        // Enroll students in courses
        student1.enrollCourse(math);
        student1.enrollCourse(physics);
        student2.enrollCourse(physics);
        
        // Assign professor to courses
        math.assignProfessor(profSmith);
        physics.assignProfessor(profSmith);
        
        // Display course details
        math.displayCourse();
        System.out.println();
        physics.displayCourse();
        System.out.println();
        // Display student's enrolled courses
        student1.displayEnrolledCourses();
        System.out.println();
        // Display professor's teaching courses
        profSmith.displayCoursesTeaching();
    }
}
