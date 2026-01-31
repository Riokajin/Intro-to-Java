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

}
