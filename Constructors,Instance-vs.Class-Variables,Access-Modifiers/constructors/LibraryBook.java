// LibraryBook.java
// Problem: Create a Book class with attributes title, author, price, and availability.
// Implement a method to borrow a book.

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;
    
    // Default constructor
    public LibraryBook() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }
    
    // Parameterized constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }
    
    // Method to borrow the book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
        }
    }
    
    // Method to display book details
    public void displayDetails() {
        System.out.println("Library Book Details:");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
    
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("1984", "George Orwell", 15.99, true);
        book.displayDetails();
        System.out.println();
        book.borrowBook();
        System.out.println();
        book.displayDetails();
    }
}
