// SchoolSystemRoles.java
// Problem 9: School System with Different Roles (Hierarchical Inheritance)
class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    public void displayRole() {
        displayInfo();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    String grade;
    
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    
    public void displayRole() {
        displayInfo();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

class Staff extends Person {
    String role;
    
    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }
    
    public void displayRole() {
        displayInfo();
        System.out.println("Role: Staff, " + role);
    }
}

public class SchoolSystemRoles {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Smith", 40, "Mathematics");
        Student student = new Student("John", 16, "10th Grade");
        Staff staff = new Staff("Ms. Lee", 35, "Administrator");
        
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}
