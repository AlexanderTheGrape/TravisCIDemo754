import java.util.Arrays;
import java.util.Optional;

public class Calculator {

	/**
     * TBD:
     * - Add all Integers together
     * - Note: do not change method signature
     * @return
     */
    // Integer ... -> zero or more Integer objects (or an array of them) may be passed as the argument(s) for that method.
//                  The argument(s) passed in this way is always an array even if there's just one.
//                  Make sure you treat it that way in the method body.
    public Integer sumAllNumbers(final Integer... valuesParam){ //
        Integer total = 0;
        Integer previousTotal = 0;
        for (Integer num : valuesParam){
            try {
                previousTotal = total;
                total = total + num;
            } catch(Exception e) {
                total = previousTotal;
            }
        }
        return total;
    }
    
	/**
     * TBD:
     * - Multiply all Integers together
     * - Note: do not change method signature
     */
    public Integer multiplyAllNumbers(final Integer... valuesParam){
        Integer total;
        try {
            if (valuesParam.length >= 1) {
                total = 1;
                for (Integer num : valuesParam) {
                    try {
                        total = total * num;
                    } catch (Exception e) {
                        total = 0;
                    }
                }
            } else {
                total = 0;
            }
        } catch(Exception f){
            total = 0;
        }
        return total;
    }
}
