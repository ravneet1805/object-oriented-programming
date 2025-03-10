// LibraryManagement.java
// Problem 4: Library Management with Books and Authors (Single Inheritance)
class Book {
    String title;
    int publicationYear;
    
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    
    public void displayInfo() {
        System.out.println("Book Title       : " + title);
        System.out.println("Publication Year : " + publicationYear);
    }
}

class Author extends Book {
    String authorName;
    String bio;
    
    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name      : " + authorName);
        System.out.println("Bio              : " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author("Clean Code", 2008, "Robert C. Martin", "A guide to writing clean code.");
        bookWithAuthor.displayInfo();
    }
}
