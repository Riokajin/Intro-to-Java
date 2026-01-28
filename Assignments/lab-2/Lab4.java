

import java.util.ArrayList;
import java.util.Arrays;

// completed by Adam Evans

public class Lab4 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
            // TODO: Fill in your grocery items
            "Milk", "Eggs", "Bread", "Cheese", "Apples", "Orange Juice"
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
       
        System.out.println("Groceries Array: " + Arrays.toString(groceries));
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
        // TODO: Loop through the array and add items to groceryList

        for (String item : groceries) {
            groceryList.add(item);
        }
        System.out.println("Grocery List: " + groceryList);
        
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        
        groceryList.add("Bananas");
        groceryList.add("Coffee");

        groceryList.remove("Eggs"); // removing by name

        System.out.println("Updated Grocery List: " + groceryList);
 
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        
        String[] vowels = {"a", "e", "i", "o", "u"};
        int vowelCount = 0;

        for (String item : groceryList) {
            String lower = item.toLowerCase();
            for (String v : vowels) {
                if (lower.startsWith(v)) {
                    vowelCount++;
                    break; // stop checking from a match is found
                }
            }
        }
            
        
 
 
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        
 
    }
}
 