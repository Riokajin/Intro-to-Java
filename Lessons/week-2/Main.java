import java.util.Scanner;
 
 
/*
    Week 2: Module 2 Learning Activity - Practice Shell
    Concepts to Practice:
    - Variables & Constants
    - if / if…else / nested if
    - switch statements
    - while and for loops
    - Increment (++) / Decrement (--) / Compound Assignment (+=, -=)
    - Typecasting
*/
 
 
class Student {
    // STEP 1: Declare instance variables

    String name;
    int id;
    String program;
    int gradeLevel;
    double gpa;
    
 
 
    // STEP 2: Declare a constant (final)
final double MIN_GPA = 0;
 
 
    // STEP 3: Method to display student info
    void displayInfo() {
        // TODO: Print all fields
        System.out.println("\n---Student Info---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("program: " + program);
        System.out.println("gradeLevel: " + gradeLevel);
        System.out.println("gpa: " + gpa);
    }
 
 
    // STEP 4: Conditional statements (if…else)
    void checkGPA() {
        // TODO: Use if…else to check GPA ranges
        if (gpa >= 3.5){
            System.out.println(name + " is an honour student.");
        }else if(gpa >= 2.0){
            System.out.println(name + " has a passing grade.");
        }else {
            System.out.println(name + " needs improvement.");
        }
        
    }
 
 
    // STEP 5: Nested if example
    void checkProgram() {
        // TODO: Nested if for program and GPA
        if(program.equalsIgnoreCase("Computer Science")){
            if(gpa >= 3.5){
                System.out.println(name + " is eligible for the CS scholarship.");
            }else{
                System.out.println(name + " is not eligible for the CS scholarship.");
            }
        }
    }
 
 
    // STEP 6: Switch statement example
    void gradeDescription() {
        // TODO: Use switch to print school type based on gradeLevel
        switch(gradeLevel){
            case 1: case 2: case 3:
                System.out.println(name + " is in Elementary School.");
                break;
            case 4: case 5: case 6:
                System.out.println(name + " is in Middle School.");
                break;
            case 7: case 8: case 9:
                System.out.println(name + " is in High School.");
            break;
            default:
                System.out.println("Invalid grade level.");

        }
    }
 
 
    // STEP 7: While loop example
    void printNumbersUpToGPA() {
        // TODO: Use while loop, typecast GPA to int
        int count = 1;
        
        while(count <= (int)gpa){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }

    // STEP 7.1: Do-While loop example
    void enterGPAs(){
        Scanner input = new Scanner(System.in);
        double gpaInput;
        do{
            System.out.print("Enter Semester GPA, press -1 to stop: ");
            gpaInput = input.nextDouble();

            if(gpaInput != -1){
                System.out.println("Recorded GPA: " + gpaInput);
            }
        }while(gpaInput != -1);
        System.out.println("All semesters GPA are recorded");
    }
 
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
        for(int i = 1; i <= 5; i++){
            System.out.println(id * i + "");
        }
    }
 
    // STEP 8.1: Enhance For loop: used to loop through arrays and objections easily
    // Also called for-each loop

//for(dataType variable : arrayName){}

    void printSemesterGPA(){
        double[] semesterGPA = {3.0, 3.5, 3.7};
        System.out.print("Semester GPAs: ");
        for(double g : semesterGPA){
            System.out.print(g + " ");
        }
        System.out.println();
    }
    
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
        System.err.println("Original GPA: " + gpa);
        gpa ++;
        gpa += 0.5;
        gpa --;
        gpa -= 0.2;
        System.out.println("Updated GPA: " + gpa);
    }
}
 
 
 
// MAIN CLASS
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
 
        System.out.println("==== Week 2: Module 2 Learning Activity ====");
 
 
        // STEP 1: Create a Student object
        Student s1 = new Student();
 
 
        // STEP 2: Assign values to fields (or use Scanner input)
        s1.name = "Adam";
        s1.id = 101;
        s1.program = "computer science";
        s1.gradeLevel = 5;
        s1.gpa = 4.2;
 
 
        // STEP 3: Call methods to practice all concepts
        s1.displayInfo();
        s1.checkGPA();
        s1.checkProgram();
        s1.gradeDescription();
        s1.printNumbersUpToGPA();
        s1.enterGPAs();
        s1.printMultiplesOfID();
        s1.printSemesterGPA();
        s1.updateGPA();
        
    }
}
 
 
