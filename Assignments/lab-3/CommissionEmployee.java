public class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 
    // TODO 5: Create constructor using super()
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
 
    // TODO 6: Create getters and setters with validation
    public double getGrossSales() { 
        return grossSales; 
    } 
    public double getCommissionRate() { 
        return commissionRate; 
    }
public void setGrossSales(double grossSales) { 
    if (grossSales < 0.0) {
        throw new IllegalArgumentException("Sales must be a positive number");
    } 
    this.grossSales = grossSales;
} 
public void setCommissionRate(double commissionRate) { 
    if (commissionRate <= 0.0 || commissionRate >= 1.0) {
        throw new IllegalArgumentException("Commission Rate must be between 0.0 and 1.0");
    }
    this.commissionRate = commissionRate;
}

 
    // TODO 7: Override earnings()
 
    // TODO 8: Override toString()
}