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
        Integer testNum = 4;
        Integer testInput1 = 1;
        Integer testInput2 = 3;
        assertEquals(testNum, calculator.sumAllNumbers(testInput1, testInput2));
    }

    /**
     * TBD:
     * - Add tests for null inputs
     * - Add tests for multiplication of two numbers
     * - Add tests for multiplication of multiple numbers
     *
     */
    //@Test
    public void testMultiplyAllNumbers() {
    	//write tests here
        assertTrue(true);
    }
}
