package impl.com.interfac;

import java.math.BigDecimal;

public class Employee {

    private BigDecimal salary;

    public Employee() {
    }

    public Employee(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
