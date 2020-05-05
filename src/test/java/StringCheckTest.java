import org.junit.Test;
import static org.junit.Assert.*;

public class StringCheckTest {
    private StringCheck stringCheck = new StringCheck();

    @Test
    public void testIsPalindrome() {
        assertFalse(stringCheck.isPalindrome("aabb"));
        assertFalse(stringCheck.isPalindrome(null));
        assertFalse(stringCheck.isPalindrome("NotEvenClose"));
        assertTrue(stringCheck.isPalindrome(""));
        assertTrue(stringCheck.isPalindrome("abba"));
        assertTrue(stringCheck.isPalindrome("tattarrattat"));
        // check if it is a palindrome when there is capitalisation (it should ignore capitalisation)
        assertTrue(stringCheck.isPalindrome("Tattarrattat"));
    }

    /**
     * TBD:
     * - Create tests for the other methods you create in the StringCheck Class
     */
    @Test public void testIsNull(){
        assertTrue(stringCheck.isNull(null));
        assertFalse(stringCheck.isNull("bob"));
    }

    @Test public void testIsEmpty(){
        assertTrue(stringCheck.isEmpty(""));
        assertFalse(stringCheck.isEmpty("bob"));
    }

    @Test public void testIsOnlyWhiteSpace(){
        assertTrue(stringCheck.isOnlyWhitespace(""));
        assertTrue(stringCheck.isOnlyWhitespace("\n"));
        assertFalse(stringCheck.isOnlyWhitespace("bob"));
    }
}
