import java.util.*;
import java.util.regex.*;
 
 
public class StudentValidatorLab {
 
 
    public static void main(String[] args) {
 
 
        Scanner scanner = new Scanner(System.in);
 
 
        // =====================================================
        // PART 1 — NAME VALIDATION (String + Regex)
        // =====================================================
 
 
        // STEP 1:
        // Ask user to enter full name

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
 
        // STEP 2:
        // Validate name
        // Only letters and spaces allowed
        // Use regex with matches()

        if (fullName.matches("[A-Za-z ]+")) {
            System.out.println("Valid name!");
        } else {
            System.out.println("Invalid name. Only letters and spaces allowed.");
        }
 
 
        // =====================================================
        // PART 2 — STUDENT ID VALIDATION
        // Format: S-1234
        // =====================================================
 
 
        // STEP 3:
        // Ask user to enter student ID
 
        System.out.print("Enter your student ID (S-1234): ");
        String studentID = scanner.nextLine();
 
        // STEP 4:
        // Validate format using regex

        if (studentID.matches("S-\\d{4}")) {
            System.out.println("Valid student ID!");
        } else {
            System.out.println("Invalid ID format.");
        }
        
 
 
        // =====================================================
        // PART 3 — EMAIL VALIDATION
        // =====================================================
 
 
        // STEP 5:
        // Ask user to enter email
 
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
 
        // STEP 6:
        // Validate email format

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (email.matches(emailRegex)) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email format.");
        }
 
 
 
        // =====================================================
        // PART 4 — SENTENCE PROCESSING
        // =====================================================
 
 
        // STEP 7:
        // Ask user to enter a sentence

 
 
        // STEP 8:
        // Count vowels using Character class

 
 
 
 
        // STEP 9:
        // Reverse sentence using StringBuilder
       
 
 
 
 
        // STEP 10:
        // Replace all digits in sentence with '*'
 

 
 
        // =====================================================
        // PART 5 — TOKENIZING
        // =====================================================
 
 
        // STEP 11:
        // Create string: "Math,Science,Java,English"
        // Split using comma
        // Print each course
 

 
 
        // =====================================================
        // PART 6 — PATTERN & MATCHER
        // =====================================================
 
 
        // STEP 12:
        // Create string: "Invoice number is 4567 and total is 890"
        // Use Pattern and Matcher to extract all numbers
 

 
 
        scanner.close();
    }
}
 
 