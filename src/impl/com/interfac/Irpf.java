package impl.com.interfac;

import java.math.BigDecimal;

public class Irpf  extends TemplateOfTribute {

    @Override
    public BigDecimal useMinTax(BigDecimal salary) {
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal useMedTax(BigDecimal salary) {
        return salary.multiply(BigDecimal.valueOf(0.075));
    }

    @Override
    public BigDecimal useMedTwoTax(BigDecimal salary) {
        return salary.multiply(BigDecimal.valueOf(0.15));
    }

    @Override
    public BigDecimal useMedThreeTax(BigDecimal salary) {
        return salary.multiply(BigDecimal.valueOf(0.225));
    }

    @Override
    public BigDecimal useMaxTax(BigDecimal salary) {
        return salary.multiply(BigDecimal.valueOf(0.275));
    }

    @Override
    public boolean shouldUseMinTax(BigDecimal salary) {
        return salary.compareTo(BigDecimal.valueOf(1787.77)) <= 0;
    }

    @Override
    public boolean shouldUseMedTax(BigDecimal salary) {
        return salary.compareTo(BigDecimal.valueOf(2679.30)) >= 0 && salary.compareTo(BigDecimal.valueOf(3572.43)) <= 0;
    }

    @Override
    public boolean shouldUseMedTwoTax(BigDecimal salary) {
        return salary.compareTo(BigDecimal.valueOf(3572.44)) >= 0 && salary.compareTo(BigDecimal.valueOf(4463.81)) <= 0;
    }

    @Override
    public boolean shouldUseMedThreeTax(BigDecimal salary) {
        return salary.compareTo(BigDecimal.valueOf(3572.44)) >= 0 && salary.compareTo(BigDecimal.valueOf(4463.81)) <= 0;
    }
}

/*class TestIrpf  implements Tribute {


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


}*/
