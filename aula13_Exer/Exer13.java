import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salário bruto é de: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário Líquido: " + salarioLiquido);

    }
}
