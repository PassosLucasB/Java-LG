package aula13_Exer;

//Exercico 02 = Faça um programa que pea um numero e então monstre a mensagem
// "O numero informado foi [numero]."

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);

    }
}
