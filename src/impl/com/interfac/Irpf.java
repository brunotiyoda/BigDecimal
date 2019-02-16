package impl.com.interfac;

import java.math.BigDecimal;
import java.math.MathContext;

public class Irpf implements Tribute {

    @Override
    public BigDecimal calculatesTax(BigDecimal salary) {
        BigDecimal irpf;

        if (salary.compareTo(BigDecimal.valueOf(1787.78)) >= 0 && salary.compareTo(BigDecimal.valueOf(2679.29)) <= 0) {
            irpf = salary.multiply(BigDecimal.valueOf(0.075));
            return irpf.setScale(2);
        } else if (salary.compareTo(BigDecimal.valueOf(2679.30)) >= 0 && salary.compareTo(BigDecimal.valueOf(3572.43)) <= 0) {
            irpf = salary.multiply(BigDecimal.valueOf(0.15));
            return irpf.setScale(2);
        } else if (salary.compareTo(BigDecimal.valueOf(3572.44)) >= 0 && salary.compareTo(BigDecimal.valueOf(4463.81)) <= 0) {
            irpf = salary.multiply(BigDecimal.valueOf(0.225));
            return irpf.setScale(2);
        } else if (salary.compareTo(BigDecimal.valueOf(4463.81)) > 0) {
            irpf = salary.multiply(BigDecimal.valueOf(0.275));
            return irpf.setScale(2);
        }

        return BigDecimal.ZERO;
    }
}
