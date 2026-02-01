import java.util.ArrayList;
import java.util.Scanner;

// Main program that manages the library system using a menu and ArrayList
public class LibraryManager {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // ArrayList to store Book objects
        ArrayList<Book> library = new ArrayList<>();

        boolean running = true;

        // Main menu loop (runs until user chooses Exit)
        while (running) {
            System.out.println("\n Library Menu");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Display all available books");
            System.out.println("4. Search books by author");
            System.out.println("5. Check out a book");
            System.out.println("6. Return a book");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine(); // clear leftover newline

            // Handle menu choices using a switch statement
            switch (choice) {
                case 1:
                    //Add a new book
                    System.out.println("\nAdd a new book");

                    System.out.print("Enter book title: ");
                    // read text and trim spaces off of the result
                    String title = input.nextLine().trim();

                    System.out.print("Enter book author: ");
                    String author = input.nextLine().trim();

                    System.out.print("Enter book ISBN (10 or 13 characters): ");
                    String isbn = input.nextLine().trim();

                    // New books start as available
                    boolean available = true;

                    // Create the Book object using the constructor
                    Book newBook = new Book(title, author, isbn, available);

                    library.add(newBook);

                    System.out.println("Book added successfully!");
                    break;

                case 2:

                    //View all books
                    System.out.println("\nAll Books");

                    if (library.isEmpty()) {
                        System.out.println("No books in the library yet.");
                    } else {
                        for (Book b : library) {
                            b.displayInfo();
                        }
                    }                    
                    break;

                case 3:

                    //View all books currently available
                    System.out.println("\nAvailable Books");

                    boolean anyAvailable = false;

                    for (Book b : library) {
                        if (b.isAvailable()) {
                            b.displayInfo();
                            anyAvailable = true;
                        }
                    }

                    if (!anyAvailable) {
                        System.out.println("No available books at the moment.");
                    }
                    break;

                case 4:

                    // Search for books by author name
                    System.out.print("\nEnter author name to search: ");
                    String searchAuthor = input.nextLine().trim();

                    boolean found = false;

                    for (Book b : library) {
                        if (b.getAuthor().equalsIgnoreCase(searchAuthor)) {
                            b.displayInfo();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No books found by that author.");
                    }
                    break;

                case 5:

                    // Check out a book (set available to false)
                    System.out.print("\nEnter ISBN of the book to check out: ");
                    String checkoutIsbn = input.nextLine().trim();

                    boolean checkedOut = false;

                    for (Book b : library) {
                        if (b.getIsbn().equals(checkoutIsbn)) {
                            if (b.isAvailable()) {
                                b.setAvailable(false);
                                System.out.println("Book checked out successfully.");
                            } else {
                                System.out.println("That book is already checked out.");
                            }
                            checkedOut = true;
                            break; // stop searching once found
                        }
                    }

                    if (!checkedOut) {
                        System.out.println("No book found with that ISBN.");
                    }
                    break;
                
                case 6:

                    // Return a book (set available to true)
                    System.out.print("\nEnter ISBN of the book to return: ");
                    String returnIsbn = input.nextLine().trim();

                    boolean returned = false;

                    for (Book b : library) {
                        if (b.getIsbn().equals(returnIsbn)) {
                            if (!b.isAvailable()) {
                                b.setAvailable(true);
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("That book is already marked as available.");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("No book found with that ISBN.");
                    }
                    break;

                case 7:

                    // Exit the program
                    running = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        input.close();
    }
}
