// Person.java
// Problem: Create a Person class with a copy constructor that clones another person's attributes.

public class Person {
    String name;
    int age;
    
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    // Method to display person details
    public void display() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
    
    public static void main(String[] args) {
        Person original = new Person("John Doe", 30);
        Person clone = new Person(original);
        original.display();
        System.out.println();
        clone.display();
    }
}
