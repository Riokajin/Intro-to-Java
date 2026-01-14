import java.util.Scanner;
 
 
/*
    Week 1 Comprehensive Program: Account Class
    Covers: Classes, Objects, Instance Variables, Constructors,
    Set/Get Methods, Reference Types, Constants, Methods,
    Abstract Class, Interface
*/
 
 
// ACCOUNT CLASS
 
class Account {
    // Instance variables (private for encapsulation)
    private String name; // Account holder's name
    private double balance; // Account balance
    
   
 
    // Constant: minimum balance
    private static final double MIN_BALANCE = 0.0;

    /**
     * Constructor to initialize Account object
     * @param name Account holder's name
     * @param balance Initial balance (must be >= 0)
     */
    
public Account(String name, double balance) {
    this.name = name;
    if (balance >= MIN_BALANCE) {
        this.balance = balance;
    } else {
        System.out.println("Error: Initial balance cannot be negative.");
        this.balance = MIN_BALANCE;
    }
}
    
   
 
    
    // Set Methods (Mutators)
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        if (balance >= MIN_BALANCE) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }
  
    // Get Methods (Accessors)
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    // Display Info
    public void displayInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Balance: $" + balance);
    }
    
    // Method with parameter and return
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        } else {
            System.out.println("Error: Deposit amount must be positive.");
            return balance;
        }
    }
}
 
// ABSTRACT CLASS EXAMPLE
 
abstract class AccountBase {
    // abstract method
    public abstract double calculateInterest();
 
 //normal method
    public void displayAccountType() {
        System.out.println("This is a base account.");
    }
    
}
 
 
class SavingsAccount extends AccountBase {

    private double balance;
    private double rate;

    SavingsAccount(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    @Override
    public double calculateInterest(){
        return balance * rate;
    }
}
    
// INTERFACE EXAMPLE
 
interface Printable {
    void print();
}
 
 
class AccountReport implements Printable {
    private Account account;
 
 
    AccountReport(Account account) {
        this.account = account;
    }
 
 
    @Override
    public void print() {
        System.out.println("\n--- Account Report ---");
        account.displayInfo();
    }
}
 
 
// -------------------------
// MAIN CLASS
// -------------------------
public class Main {
    public static void main(String[] args) {
 
 
        System.out.println("==== Week 1: Account Class Demo ====");
 
 
       
        // 1. Creating Account Objects
        Account account1 = new Account("Adam", 1000.0);
        Account account2 = new Account("Annette", 500.0);
               
        // 2. Using Set/Get Methods
        account1.setName("Adam Evans");
        System.out.print(account1.getName());

        
        account1.setBalance(1200.0);
        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Holder: " + account2.getName());
      
        // 3. Primitive vs Reference Types
        Account account3 = account1; // Reference type
        account3.setBalance(500);
        System.out.println("Account 1 Holder after change: " + account1.getName());
        
        // 4. Constants
        System.out.println("\nMinimum balance constant: $" + 0.0);
        
      
        // 5. Methods with Parameters & Return Values
        double newBalance = account1.deposit(300);
        System.out.println("Account 1 New Balance after deposit: " + newBalance);
        
        // 6. Abstract Class
        SavingsAccount savings = new SavingsAccount(1200, 0.05);
        savings.displayAccountType();
        System.out.println("Interest Earned for savings account: $" + savings.calculateInterest());
       
        // 7. Interface
        AccountReport report = new AccountReport(account1);
        report.print();
        
        // 8. Scanner Example (Optional User Input)
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("\nEnter Deposit Amount for Account 2: ");
            if (scanner.hasNextDouble()) {
            double depositAmount = scanner.nextDouble();
            account2.deposit(depositAmount);
            System.out.println("Account 2 New Balance after deposit: " + account2.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
        System.out.print("\nEnter Deposit Amount for Account 2: ");
       
        }
    }
}
