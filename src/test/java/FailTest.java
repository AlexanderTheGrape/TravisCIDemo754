import org.junit.Test;
import static org.junit.Assert.*;

//Note: These test cases do not follow testing best practices and are for marking purposes only
public class FailTest {
    private Calculator calculator = new Calculator();
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void failingTest() {
        assertFalse(stringCheck.isPalindrome("mum"));
        assertEquals(new Integer(10), calculator.multiplyAllNumbers(1,3));
    }

}