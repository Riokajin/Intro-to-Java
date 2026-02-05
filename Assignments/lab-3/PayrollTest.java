public class PayrollTest {
 
    public static void main(String[] args) {
 
        // TODO 9: Create a CommissionEmployee object
        CommissionEmployee employee = new CommissionEmployee("Adam", "Evans", "123-456-789", 5000.0, 0.10);
 
        // TODO 10: Display employee details
        System.out.println(employee);
 
        // TODO 11: Display earnings
        System.out.println("Earnings: " + employee.earnings());
    }
}
 
 