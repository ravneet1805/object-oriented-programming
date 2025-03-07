// Program to Handle Book Details
// Problem Statement: Create a Book class with attributes title, author, and price. 
// Add a method to display the book details.

public class Book {
    String title;
    String author;
    double price;
    
    // Constructor to initialize book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Method to display the book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    
    // Main method to test the Book class
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 45.99);
        book.displayDetails();
    }
}
