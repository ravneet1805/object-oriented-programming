// BookLibrary.java
// Problem: Book Library System
// Create a Book class with ISBN (public), title (protected), and author (private).
// Provide methods to set and get the author.
// Create a subclass EBook to access ISBN and title.

public class BookLibrary {
    public String ISBN;
    protected String title;
    private String author;
    
    public BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    // Setter and getter for author
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void display() {
        System.out.println("Book Details:");
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends BookLibrary {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    
    // Method to display ebook details; can access ISBN and title directly.
    public void displayEBook() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title: " + title);
        // For author, using getter
        System.out.println("Author: " + getAuthor());
    }
    
    public static void main(String[] args) {
        EBook ebook = new EBook("123-4567890123", "Digital Transformation", "Jane Smith");
        ebook.displayEBook();
    }
}
