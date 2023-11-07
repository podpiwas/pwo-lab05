package pwo.seq;

import java.math.BigDecimal;

public class LucasGenerator extends FibonacciGenerator {

    public LucasGenerator() {
        super();
        reset();
        current = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }

    public BigDecimal previousTerm() {
        if (lastIndex == 0) {
            lastIndex--;
            return new BigDecimal(2);
        }
        return super.previousTerm();
    }
}
