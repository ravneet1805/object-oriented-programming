// LibraryAndBooks.java
// Problem 1: Library and Books (Aggregation)
// A Library contains an ArrayList of Book objects. A Book exists independently.

import java.util.ArrayList;

class Book {
    String title;
    String author;
    
    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    // Display book details
    public void display() {
        System.out.println("Title : " + title + ", Author: " + author);
    }
}

class Library {
    // Aggregation: Library has an ArrayList of Book objects.
    private ArrayList<Book> books;
    String libraryName;
    
    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }
    
    // Add a book to the library
    public void addBook(Book b) {
        books.add(b);
    }
    
    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            b.display();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book("Effective Java", "Joshua Bloch");
        
        // Create two libraries
        Library centralLibrary = new Library("Central Library");
        Library communityLibrary = new Library("Community Library");
        
        // Add books to libraries (aggregation: books exist independently)
        centralLibrary.addBook(book1);
        centralLibrary.addBook(book2);
        
        communityLibrary.addBook(book2);
        communityLibrary.addBook(book3);
        
        // Display books in each library
        centralLibrary.displayBooks();
        System.out.println();
        communityLibrary.displayBooks();
    }
}
