
import java.util.Scanner;

public class Exer09 {

    // Exercicio 09 = Faça um Programa que peça a temperatura em graus Farenheit
    // transforme e mostre a temperatura em graus Celsius

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f - 31) / 9);

        System.out.println("A temperatura  " + f + " F é igual a " + c + " C");

    }

}