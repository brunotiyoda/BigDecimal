package impl.com.interfac;

import java.math.BigDecimal;

public class Inss implements Tribute {

    @Override
    public BigDecimal calculatesTax(BigDecimal salary) {
        BigDecimal inss;

        if (salary.compareTo(BigDecimal.valueOf(1317.07)) <= 0) {
            inss = salary.multiply(BigDecimal.valueOf(0.08));
            return inss;
        } else if (salary.compareTo(BigDecimal.valueOf(1317.08)) >= 0 && salary.compareTo(BigDecimal.valueOf(2195.12)) <= 0) {
            inss = salary.multiply(BigDecimal.valueOf(0.09));
            return inss;
        } else if (salary.compareTo(BigDecimal.valueOf(2195.13)) >= 0 && salary.compareTo(BigDecimal.valueOf(4390.24)) <= 0) {
            inss = salary.multiply(BigDecimal.valueOf(0.11));
            return inss;
        } else {
            inss = salary.subtract(BigDecimal.valueOf(482.83));
            return inss;
        }
    }
}
