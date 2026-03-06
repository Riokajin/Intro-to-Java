import java.util.*;
import java.util.regex.*;
 
 
public class StringAndRegexLab {
 
 
    public static void main(String[] args) {
 
 
        // =====================================================
        // ================= PART 1 ============================
        // Strings, StringBuilder, Character, Tokenizing
        // =====================================================
 
 
        // STEP 1: Create a String called message
        // Assign value: "Java Programming Language"
 
        String message = "Java Programming Language";
 
 
 
 
        // STEP 2: Print length of message
 
        System.out.println("length: " + message.length());
 
 
 
 
        // STEP 3: Print character at index 5
 
 
        System.out.println("char at index 5: " + message.charAt(5));
 
 
 
        // STEP 4: Extract substring "Programming"
 
 
        String sub = message.substring(5, 16);
        System.out.println("Substring: " + sub);
 
 
 
        // STEP 5: Compare two strings using equals()
 
 
        String another = "Hello";
        System.err.println("Are they equal? " + message.equals(another));
 
 
 
        // STEP 6: Convert message to uppercase
 
        System.out.println("Uppercase: " + message.toUpperCase()); 
 
 
 
        // STEP 7: Use StringBuilder
        // Create StringBuilder with "Hello"
        // Append " Java"
        // Insert "Awesome " at beginning
        // Reverse it
        // Print result
 
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Java");
        sb.insert(0, "Awesome ");
        sb.reverse();
        System.out.println("String Builder result: " + sb);
 
 
 
        // STEP 8: Use Character class
        // Create char variable
        // Check isDigit, isLetter, isUpperCase
        char ch = 'A';
        System.out.println("Is Digit? " + Character.isDigit(ch));
        System.out.println("Is Letter? " + Character.isLetter(ch));
        System.out.println("Is Upper Case? " + Character.isUpperCase(ch));
 
 
 
 
 
        // STEP 9: Tokenize this string:
        // "Apple,Banana,Mango"
        // Split by comma and print each fruit
 
 
 
 
 
 
        // =====================================================
        // ================= PART 2 ============================
        // Regular Expressions (Pattern & Matcher)
        // =====================================================
 
 
        // STEP 10: Validate Email using regex
        // Create a String email = "student@email.com"
        // Write regex to validate simple email format
        // Print if valid or not
 
 
 
 
 
 
        // STEP 11: Replace digits in a string
        // Example: "Java123"
        // Replace all digits with "*"
 
 
 
 
 
 
        // STEP 12: Extract all numbers from string
        // Example: "Order number is 4567"
        // Use Pattern and Matcher
        // Print matched number
 
 
 
 
 
 
        // STEP 13: Check if string contains only letters
        // Example: "JavaOnly"
        // Print true/false
 
 
 
 
 
 
        // STEP 14: Split sentence using regex
        // Sentence: "Java   is   powerful"
        // Split by multiple spaces
        // Print each word
 
 
 
 
 
 
    }
}
 
 
 