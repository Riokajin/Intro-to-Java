import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManager {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // ArrayList to store Book objects
        ArrayList<Book> library = new ArrayList<>();

        boolean running = true;

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

            switch (choice) {
                case 1:
                    // TODO: Add a new book
                    break;

                case 2:
                    // TODO: Display all books
                    break;

                case 3:
                    // TODO: Display available books
                    break;

                case 4:
                    // TODO: Search books by author
                    break;

                case 5:
                    // TODO: check out a book
                    break;
                
                case 6:
                    // TODO: Return a book
                    break;
                case 7:
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
