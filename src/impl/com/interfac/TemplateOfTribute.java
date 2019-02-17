package impl.com.interfac;

import java.math.BigDecimal;

// Template Method
public abstract class TemplateOfTribute implements Tribute {

    @Override
    public BigDecimal calculatesTax(BigDecimal salary) {
        if (shouldUseMinTax(salary)) {
            return useMinTax(salary);
        } else if (shouldUseMedTax(salary)) {
            return useMedTax(salary);
        } else if (shouldUseMedTwoTax(salary)) {
            return useMedTwoTax(salary);
        } else if (shouldUseMedThreeTax(salary)) {
            return useMedThreeTax(salary);
        } else {
            return useMaxTax(salary);
        }
    }

    public abstract BigDecimal useMinTax(BigDecimal salary);

    public abstract BigDecimal useMedTax(BigDecimal salary);

    public abstract BigDecimal useMedTwoTax(BigDecimal salary);

    public abstract BigDecimal useMedThreeTax(BigDecimal salary);

    public abstract BigDecimal useMaxTax(BigDecimal salary);

    public abstract boolean shouldUseMinTax(BigDecimal salary);

    public abstract boolean shouldUseMedTax(BigDecimal salary);

    public abstract boolean shouldUseMedTwoTax(BigDecimal salary);

    public abstract boolean shouldUseMedThreeTax(BigDecimal salary);

}
