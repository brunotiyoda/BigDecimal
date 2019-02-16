package impl.com.interfac;

import java.math.BigDecimal;

public class Fgts implements Tribute {

    @Override
    public BigDecimal calculatesTax(BigDecimal salary) {
        return salary.multiply(BigDecimal.valueOf(0.08));
    }
}
