// SchoolStudentsCourses.java
// Problem 1 (Self): School and Students with Courses (Association and Aggregation)
// A School aggregates Student objects. Each Student can enroll in multiple courses,
// and each Course can have multiple students.

import java.util.ArrayList;

class Course {
    String courseName;
    // List of students enrolled in this course.
    private ArrayList<Student> enrolledStudents;
    
    public Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new ArrayList<>();
    }
    
    // Add a student to the course
    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
    
    // Display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    // Association: A student can enroll in many courses.
    private ArrayList<Course> courses;
    
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    
    // Enroll in a course (association both ways)
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }
    
    // Display courses the student is enrolled in
    public void displayCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    // Aggregation: A school aggregates students.
    private ArrayList<Student> students;
    
    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }
    
    public void displayStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        // Create some courses
        Course math = new Course("Mathematics");
        Course english = new Course("English Literature");
        Course science = new Course("Science");
        
        // Create some students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");
        
        // Create a school and add students (aggregation)
        School school = new School("Greenwood High");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        
        // Enroll students in courses (association, many-to-many)
        student1.enrollInCourse(math);
        student1.enrollInCourse(english);
        
        student2.enrollInCourse(english);
        student2.enrollInCourse(science);
        
        student3.enrollInCourse(math);
        student3.enrollInCourse(science);
        
        // Display students in the school
        school.displayStudents();
        System.out.println();
        
        // Each student displays their courses
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
        System.out.println();
        student3.displayCourses();
        System.out.println();
        
        // Each course displays its enrolled students
        math.displayEnrolledStudents();
        System.out.println();
        english.displayEnrolledStudents();
        System.out.println();
        science.displayEnrolledStudents();
    }
}
