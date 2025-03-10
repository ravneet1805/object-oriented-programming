// Book.java
// Problem: Create a Book class with attributes title, author, and price.
// Provide both default and parameterized constructors.

public class Book {
    String title;
    String author;
    double price;
    
    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
    }
    
    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Method to display book details
    public void display() {
        System.out.println("Book Details:");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }
    
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("Effective Java", "Joshua Bloch", 45.00);
        defaultBook.display();
        System.out.println();
        paramBook.display();
    }
}
