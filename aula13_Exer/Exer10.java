
import java.util.Scanner;
//Exercicio 10 = Faça um programa que peça a temperatura em graus Celcius
// transforme e mostre em graus Farenheit.

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celcius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura  " + c + " C é igual a " + f + " F");

    }
}