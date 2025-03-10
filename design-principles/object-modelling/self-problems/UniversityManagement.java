// UniversityManagement.java
// Problem 2: University with Faculties and Departments (Composition and Aggregation)
import java.util.ArrayList;

class Department {
    String deptName;
    
    public Department(String deptName) {
        this.deptName = deptName;
    }
    
    public void display() {
        System.out.println("Department: " + deptName);
    }
}

class Faculty {
    String name;
    String designation;
    
    public Faculty(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    
    public void display() {
        System.out.println("Faculty: " + name + ", Designation: " + designation);
    }
}

class University {
    String universityName;
    // Composition: University owns its departments.
    private ArrayList<Department> departments;
    // Aggregation: Faculty members exist independently.
    private ArrayList<Faculty> faculties;
    
    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }
    
    public void addDepartment(Department dept) {
        departments.add(dept);
    }
    
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    
    public void displayUniversity() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.display();
        }
    }
    
    // Simulate deletion of University: Departments (composition) are removed.
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University " + universityName + " deleted along with its departments.");
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University uni = new University("State University");
        
        // Add departments (composition: tied to university)
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");
        uni.addDepartment(cs);
        uni.addDepartment(ee);
        
        // Add faculties (aggregation: exist independently)
        Faculty profSmith = new Faculty("Smith", "Professor");
        Faculty profJones = new Faculty("Jones", "Associate Professor");
        uni.addFaculty(profSmith);
        uni.addFaculty(profJones);
        
        uni.displayUniversity();
        System.out.println();
        
        // Delete university: departments are removed
        uni.deleteUniversity();
        System.out.println();
        // Faculty members still exist independently.
        System.out.println("Remaining Faculty:");
        profSmith.display();
        profJones.display();
    }
}
