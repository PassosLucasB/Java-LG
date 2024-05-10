import java.util.Scanner;

public class Exer08 {

    // Exercicio 08 = Faça um programa que pergunte quanto você ganha por hora
    // e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;

        System.out.println("O salário é de: " + salario);

    }

}
