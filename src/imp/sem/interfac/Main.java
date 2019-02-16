package imp.sem.interfac;

public class Main {

    private static double calculaINSS(double salario) {
        double inss;

        if (salario <= 1317.07) {
            inss = salario * 0.08;
            return inss;
        } else if (salario >= 1317.08 && salario <= 2195.12) {
            inss = salario * 0.09;
            return inss;
        } else if (salario >= 2195.13 && salario <= 4390.24) {
            inss = salario * 0.11;
            return inss;
        } else if (salario > 4390.24) {
            inss = salario - 482.93;
            return inss;
        }
        return 0;
    }

    private static double calculaFGTS(double salario) {
        return salario * 0.08;
    }

    private static double calculaIRPF(double salario) {
        double irpf;

       if (salario >= 1787.78 && salario <= 2679.29) {
            irpf = salario * 0.075;
            return irpf;
        } else if (salario >= 2679.30 && salario <= 3572.43) {
            irpf = salario * 0.15;
            return irpf;
        } else if (salario >= 3572.44 && salario <= 4463.81) {
            irpf = salario * 0.225;
            return irpf;
        } else if (salario > 4463.81) {
            irpf = salario * 0.275;
            return irpf;
        }

        return 0;
    }

    private static double salarioLiquido(double salario, double inss, double irpf) {
        return salario - inss - irpf;
    }

    public static void main(String[] args) {

        double salarioBruto = 4463.81;

        double inss = calculaINSS(salarioBruto);
        double fgts = calculaFGTS(salarioBruto);
        double irpf = calculaIRPF(salarioBruto);
        double salarioLiquido = salarioLiquido(salarioBruto, inss, fgts);

        System.out.println(inss);
        System.out.println(fgts);
        System.out.println(irpf);
        System.out.println(salarioLiquido);

    }
}
