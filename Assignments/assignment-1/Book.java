// Represents a single book in the library system
public class Book {
    
    // Fields to store book information (encapsulation)
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Default constructor (creates an empty, available book)
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.available = true;
    }

    // Constructor with arguments (used when adding a new book)
    public Book(String title, String author, String isbn, boolean available){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // Getters (provide read-only access to fields)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters with validation to protect data integrity

    public void setTitle(String title) {
        //Title validation
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid title. Keeping previous value.");
        } else {
            this.title = title.trim();
        }
        
    }

    public void setAuthor(String author) {
        // Author validation
        if (author == null || author.trim().isEmpty()) {
            System.out.println("Invalid author. Keeping previous value.");
        } else {
            this.author = author.trim();
        }
        
    }

    public void setIsbn(String isbn) {
        // ISBN must be exactly 10 or 13 characters
        if (isbn != null && (isbn.length() == 10 || isbn.length() == 13)) {
          this.isbn = isbn;  
        } else {
            System.out.println("Invalid ISBN. Must be 10 or 13 characters. Keeping previous value.");
        }
        
    }

    public void setAvailable(boolean available) {
        // Marks the book as available or checked out
        this.available = available;
    }



    
    // Display method containing all details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        // ? is a small if/else called ternary operator
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

}
