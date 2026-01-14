 
import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
        //Step 7 
        String again = "yes";
        while (again.equalsIgnoreCase("yes")) {
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String todaysWeather;
        String precipitation;
        String windSpeed;
        int tempHigh;
        int tempLow;
        int uvIndex;
 
 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
 
        // TODO: Prompt user and read input
        
        System.out.print("Enter today's weather conditions (ex. Sunny, Overcast etc.): ");
        todaysWeather = input.nextLine();
        System.out.print("Enter possibility of precipitation: ");
        precipitation = input.nextLine();
        System.out.print("Enter wind speed (km/h): ");
        windSpeed = input.nextLine();
        System.out.print("Enter daily high temp in C: ");
        tempHigh = input.nextInt();
        System.out.print("Enter daily low temp: ");
        tempLow = input.nextInt();
        System.out.print("Enter UV index: ");
        uvIndex = input.nextInt();
        
        // TODO: Use loops to validate high/low temperatures and UV index       

        while (tempLow > tempHigh) {
            System.out.print("Low temperature cannot be higher than high temperature. Please re-enter low temperature: ");
            tempLow = input.nextInt();
        }        
        
        while (uvIndex < 0) {
            System.out.print("UV index cannot be negative. Please re-enter UV index: ");
            uvIndex = input.nextInt();
        }
        

 
 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary
        int highTempInt = (int) tempHigh;
        int lowTempInt = (int) tempLow;
 
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
        String tips = "";
        if (uvIndex >= 6) {
            tips = tips + "Use sunscreen. ";
        }
        if (precipitation.equalsIgnoreCase("high")) {
            tips = tips + "carry an umbrella. ";
        }
        if (Integer.parseInt(windSpeed) > 40) {
            tips = tips + "Windy conditions expected. ";
        }
 
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
        String fullReport = "Today's weather: " + todaysWeather + ". " +
                            "Precipitation: " + precipitation + ". " +
                            "Wind Speed: " + windSpeed + " km/h. " +
                            "High Temp: " + highTempInt + "C. " +
                            "Low Temp: " + lowTempInt + "C. " +
                            "UV Index: " + uvIndex + ". " +
                            "Tips: " + tips;
        
 
 
        /*
        STEP 6: Print the full weather report
        */
       
 
 
        // TODO: Output your report using System.out.println()
        System.out.println(fullReport);
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
        System.out.print("Would you like to enter another day's report? (yes/no): ");
        again = input.nextLine();
        }


        
 
 
        input.close();
    }
}
 
 
 