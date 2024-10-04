import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    Calculator testInstance = new Calculator();

    @Test
    public void testAddition() {
        // Test case 1: Positive numbers
        int num1 = 5;
        int num2 = 10;
        int expectedSum = 15;

        int actualSum = testInstance.addNumbers(num1, num2);
        assertEquals(expectedSum, actualSum);

        // Test case 2: Negative numbers
        num1 = -5;
        num2 = -10;
        expectedSum = -15;

        actualSum = testInstance.addNumbers(num1, num2);
        assertEquals(expectedSum, actualSum);

        // Test case 3: Mixed numbers
        num1 = -5;
        num2 = 10;
        expectedSum = 5;

        actualSum = testInstance.addNumbers(num1, num2);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testEdgeCases() {
        // Test zero case
        assertEquals(0, testInstance.addNumbers(0, 0));

        // Test large numbers
        assertEquals(Integer.MAX_VALUE, testInstance.addNumbers(Integer.MAX_VALUE, 0));

        // Test minimum integer
        assertEquals(Integer.MIN_VALUE, testInstance.addNumbers(Integer.MIN_VALUE, 0));
    }
}

