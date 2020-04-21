import java.util.Arrays;
import java.util.Optional;

public class Calculator {

	/**
     * TBD:
     * - Add all Integers together
     * - Note: do not change method signature
     * @return
     */
    public Optional<Integer> sumAllNumbers(final Integer... valuesParam){ //TODO what is an Optional<Integer>???
        return Optional.of(Arrays.stream(valuesParam).reduce(0,(a, b) -> a + b)); //TODO Figure out what this does
    }
// Integer ... -> zero or more Integer objects (or an array of them) may be passed as the argument(s) for that method.
//                  The argument(s) passed in this way is always an array even if there's just one.
//                  Make sure you treat it that way in the method body.

    
	/**
     * TBD:
     * - Multiply all Integers together
     * - Note: do not change method signature
     */
    public Integer multiplyAllNumbers(final Integer... valuesParam){
}
