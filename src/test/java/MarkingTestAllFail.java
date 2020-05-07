import org.junit.Test;
import static org.junit.Assert.*;

//Note: These test cases do not follow testing best practices and are for marking purposes only
public class MarkingTestAllFail {
    private Calculator calculator = new Calculator();
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void palindromeTests() {
        assertFalse(stringCheck.isPalindrome(""));
        assertFalse(stringCheck.isPalindrome("mum"));
        assertTrue(stringCheck.isPalindrome("123"));
    }

    @Test
    public void isEmptyTests(){
        assertFalse(stringCheck.isEmpty(""));
        assertTrue(stringCheck.isEmpty("test"));
    }
    
    @Test
    public void isNullTests(){
        assertFalse(stringCheck.isNull(null));
        assertTrue(stringCheck.isNull("test"));
    }
    
    @Test
    public void isOnlyWhitespaceTests(){
        assertFalse(stringCheck.isOnlyWhitespace(" "));
        assertTrue(stringCheck.isOnlyWhitespace("     "));
        assertTrue(stringCheck.isOnlyWhitespace("test"));
    }
    
    @Test
    public void sumAllTests(){
        assertEquals(new Integer(5), calculator.sumAllNumbers(1,2));
        assertEquals(new Integer(10), calculator.sumAllNumbers(1,2,3));
        assertEquals(new Integer(15), calculator.sumAllNumbers(1,2,3,4));
    }
    
    @Test
    public void multiplyAllTests(){
        assertEquals(new Integer(5), calculator.multiplyAllNumbers(1,3));
        assertEquals(new Integer(10), calculator.multiplyAllNumbers(1,2,3));
        assertEquals(new Integer(15), calculator.multiplyAllNumbers(1,2,3,4));
    }
}