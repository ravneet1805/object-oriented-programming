// EducationalCourseHierarchy.java
// Problem 7: Educational Course Hierarchy (Multilevel Inheritance)
class Course {
    String courseName;
    int duration; // in weeks
    
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    
    public void displayInfo() {
        System.out.println("Course: " + courseName + " (" + duration + " weeks)");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course basicCourse = new Course("Mathematics", 12);
        OnlineCourse onlineCourse = new OnlineCourse("Physics", 10, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Chemistry", 8, "Udemy", false, 299.99, 10.0);
        
        System.out.println("Basic Course:");
        basicCourse.displayInfo();
        System.out.println("\nOnline Course:");
        onlineCourse.displayInfo();
        System.out.println("\nPaid Online Course:");
        paidCourse.displayInfo();
    }
}
