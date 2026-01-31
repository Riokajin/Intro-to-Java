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

}
