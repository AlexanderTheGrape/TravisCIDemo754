import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    /**
     * TBD:
     * - Fix the initial test which is failing on purpose
     * - Add tests for null inputs
     * - Add tests for addition of two numbers
     * - Add tests for addition of multiple numbers
     *
     */
    @Test
    public void testSumAllNumbers() {
    	//this test currently fails on purpose
        //Integer[] numsToSum = [1, 3];

        // test null inputs
        Integer testNum = 0;
        assertEquals(testNum, calculator.sumAllNumbers());

        // test addition of two numbers
        testNum = 4;
        Integer testInput1 = 1;
        Integer testInput2 = 3;
        assertEquals(testNum, calculator.sumAllNumbers(testInput1, testInput2));

        // test addition of three numbers
        testNum = 6;
        Integer testInput3 = 2;
        assertEquals(testNum, calculator.sumAllNumbers(testInput1, testInput2, testInput3));

        // test addition including a null
        testNum = 4;
        assertEquals(testNum, calculator.sumAllNumbers(testInput1, testInput2, null));
    }

    /**
     * TBD:
     * - Add tests for null inputs
     * - Add tests for multiplication of two numbers
     * - Add tests for multiplication of multiple numbers
     *
     */
    @Test
    public void testMultiplyAllNumbers() {
        // Test multiplication of two numbers
        Integer testNum = 10;
        Integer testInput1 = 2;
        Integer testInput2 = 5;

        assertEquals(testNum, calculator.multiplyAllNumbers(testInput1, testInput2));

        // Test multiplication of three numbers. 2 * 5 * 2 = 20
        testNum = 20;
        Integer testInput3 = 2;
        assertEquals(testNum, calculator.multiplyAllNumbers(testInput1, testInput2, testInput3));

        // Test multiplication for null inputs. Expected: 0
        testNum = 0;

        assertEquals(testNum, calculator.multiplyAllNumbers(null));
        assertTrue(true);
    }
}
