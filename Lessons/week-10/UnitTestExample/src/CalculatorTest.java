import static org.junit.Assert.*;
import org.junit.Test;
 
public class CalculatorTest {
 
    Calculator calc = new Calculator();
 
    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2,3));
    }
 
    @Test
    public void testSubtract() {
        assertEquals(3, calc.subtract(5,2));
    }
}
 