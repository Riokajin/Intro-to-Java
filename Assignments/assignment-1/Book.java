public class Book {
    
    // Fields to store book information
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.available = true;
    }

    // Constructor with arguments
    public Book(String title, String author, String isbn, boolean available){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    // Getters
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

    // Setters

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
        if (author == numm || author.trim().isEmpty()) {
            System.out.println("Invalid author. Keeping previous value.");
        } else {
            this.author = author.trim();
        }
        
    }

    public void setIsbn(String isbn) {
        if (isbn != null && (isbn.length() == 10 || isbn() == 13)) {
          this.isbn = isbn;  
        } else {
            System.out.println("Invalid ISBN. Must be 10 or 13 characters. Keeping previous value.");
        }
        
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
