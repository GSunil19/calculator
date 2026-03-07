import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void testSqrt() {
        assertEquals(4.0, Calculator.sqrt(16), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    public void testLn() {
        assertEquals(1.0, Calculator.ln(Math.E), 0.001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2,3), 0.001);
    }
}