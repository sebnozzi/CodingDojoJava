
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void test_sum() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.sum(1, 2));
    }
}
