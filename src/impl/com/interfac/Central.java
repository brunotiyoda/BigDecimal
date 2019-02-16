package impl.com.interfac;

import java.math.BigDecimal;

public class Central {

    public static void main(String[] args) {
        Employee bruno = new Employee(BigDecimal.valueOf(3090));

        Tribute inss = new Inss();
        BigDecimal inssTotal = inss.calculatesTax(bruno.getSalary());

        Tribute irpf = new Irpf();
        BigDecimal irpfTotal = irpf.calculatesTax(bruno.getSalary());

        Tribute fgts = new Fgts();
        BigDecimal fgtsTotal = fgts.calculatesTax(bruno.getSalary());

        System.out.println("Salary......: " + bruno.getSalary());
        System.out.println("INSS........: " + inssTotal);
        System.out.println("IRPF........: " + irpfTotal);
        System.out.println("FGTS........: " + fgtsTotal);
        System.out.println("Total to pay: " + bruno.getSalary().subtract(irpfTotal).subtract(inssTotal));

    }

}
