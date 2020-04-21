
public class StringCheck {
    /**
     *TBD:
     * - Check if the string is a palindrome (a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam).
     * - Please return True if the string is a palindrome, otherwise return False
     * - Note: do not change method signature
     * '' counts as a palindrome. does not include spaces. lower case only.
     */
    public boolean isPalindrome (final String str) {
        try {
            String lowercaseStr = str.toLowerCase();
            String letters[] = lowercaseStr.split("");

            for (int i = 0; i < letters.length; i++) {
                if (letters[i] != letters[-1 * i]) {
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
        throw new RuntimeException("Write your code here");
    }
    
    /**
     * TBD:
     * - Check if the string is null
     * - Please return True if string is null, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isNull(final String str) {
        throw new RuntimeException("Write your code here");
    }
    
    /**
     * TBD:
     * - Check if the string contains only whitespace
     * - Please return True if string contains only whitespace, otherwise return False
     * - Note: do not change method signature
     */
    public boolean isOnlyWhitespace(final String str) {
        throw new RuntimeException("Write your code here");
    }
}
