package calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

        @Test
        public void testAddition() {
            calculator calculator = new calculator();
            int result = calculator.add(2, 3);
            assertEquals(5, result, "2 + 3 doit être égal à 5");
        }
    }















