import java.util.Scanner;
 
 
/*
    Module 5 Activity: Inheritance with CommissionEmployee
    Build an Employee superclass and extend it with CommissionEmployee
    and BasePlusCommissionEmployee.
*/
 
 
// STEP 1: Define the Employee superclass
abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
 
 
    // Constructor
    public Employee(String first, String last, String ssn) {
        // TOD: initialize fields
        this.firstName = first;
        this.lastName = last;
        this.socialSecurityNumber = ssn;
    }
 
 
    // Getters
    // TOD: add getFirstName(), getLastName(), getSocialSecurityNumber()
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
 
 
    // earnings method placeholder
    public abstract double earnings();
 
 
    @Override
    public String toString() {
        // TOO: return formatted "first last\nssn: ###"
        return String.format("%s %s%nssn: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}
 
 
// STEP 2: Define CommissionEmployee as a subclass
class CommissionEmployee extends Employee {
    private double grossSales;        // weekly sales
    private double commissionRate;    // percentage
 
 
    public CommissionEmployee(String first, String last, String ssn,
                              double sales, double rate) {
        super(first, last, ssn);
        // TOD: set grossSales and commissionRate with validation
        if (sales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (rate < 0.0 || rate > 1.0) {
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.grossSales = sales;
        this.commissionRate = rate;
    }
 
 
    // TOD: getters and setters for grossSales and commissionRate
    public double getGrossSales() {
        return grossSales;
    }
 
    public double getCommissionRate() {
        return commissionRate;
    }
 
 
    @Override
    public double earnings() {
        // TOD: return grossSales * commissionRate
        return grossSales * commissionRate;
    }
 
 
    @Override
    public String toString() {
        // TOD: include the super.toString() plus grossSales and commissionRate
        return String.format("%s%nGross Sales: %.2f%nCommission Rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}
 
 
// STEP 3: Define BasePlusCommissionEmployee subclass
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;  // additional weekly salary
 
 
    public BasePlusCommissionEmployee(String first, String last, String ssn,
                                      double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        // TOO: validate and set baseSalary
        if (salary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = salary;
    }
 
 
    // TOO: getter and setter for baseSalary
    public double getBaseSalary() {
        return baseSalary;
    }
 
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
 
    @Override
    public double earnings() {
        // TOO: return baseSalary + super.earnings()
        return getBaseSalary() + super.earnings();
    }
 
 
    @Override
    public String toString() {
        // TOO: include "Base salary" and call super.toString()
        return String.format("%s%nBase Salary: %.2f", super.toString(), getBaseSalary());
    }
}
 
 
// STEP 4: Main driver class
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
 
        // TOO: Create objects of CommissionEmployee and BasePlusCommissionEmployee
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "John", "Doe", "123-45-6789", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Jane", "Smith", "987-65-4321", 15000, 0.07, 500);
 
 
        // TOO: Print their earnings individually
        System.out.println("Commission Employee:");
        System.out.println("Earnings: $" + commissionEmployee.earnings());
        System.out.println("Base Plus Commission Employee:");
        System.out.println("Earnings: $" + basePlusCommissionEmployee.earnings());
    }
}
 
 