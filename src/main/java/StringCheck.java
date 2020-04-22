import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheck {
    /**
     *TBD:
     * - Check if the string is a palindrome (a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam).
     * - Please return True if the string is a palindrome, otherwise return False
     * - Note: do not change method signature
     * '' counts as a palindrome. does not include spaces. lower case only.
     */
    // TODO Add functionality to remove empty substrings, so that a test can be made for spaces.
    public boolean isPalindrome (final String str) {
        try {
            String lowercaseStr = str.toLowerCase().replace(" ", "");
            String letters[] = lowercaseStr.split("");
            int len = letters.length;

            if (len == 0 || (letters[0] == "")){
                return true;
            }
            for (int i = 0; i < len; i++) {
                if (!letters[i].equals(letters[len - i - 1])) {
                    return false;
                }
            }
            return true;
        } catch(Exception e){
            return false;
        }
    }

    /**
     * TBD:
     * - Check if the string is empty
     * - Please return True if string is empty, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isEmpty(final String str) {
        if (str == ""){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * TBD:
     * - Check if the string is null
     * - Please return True if string is null, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isNull(final String str) {
        if (str == null){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * TBD:
     * - Check if the string contains only whitespace
     * - Please return True if string contains only whitespace, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isOnlyWhitespace(final String str) {
        boolean isWhitespace = str.matches("^\\s*$");
        return isWhitespace;
    }
}