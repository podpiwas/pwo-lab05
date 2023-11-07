package pwo.seq;

import java.math.BigDecimal;

public class TribonacciGenerator extends FibonacciGenerator {

    public TribonacciGenerator() {
        super();
        reset();
        f_3 = new BigDecimal(0);
    }

    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }

    public BigDecimal previousTerm() {
        if (lastIndex > 2) {
            current = f_3;
            f_1 = f_2;
            f_2 = f_3.subtract(f_2).subtract(f_3);
        } else if (lastIndex == 2) {
            current = new BigDecimal(0);
        } else {
            current = new BigDecimal(1);
        }
        lastIndex--;
        return current;
    }
}
