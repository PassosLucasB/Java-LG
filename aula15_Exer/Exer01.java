import java.util.Scanner;

// Faça um programa que peça 02 números e imprima o maior deles

public class Exer01 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("O num1 é maior: " + num1);
        } else {
            System.out.println("O num2 é maior: " + num2);
        }
    }
}
