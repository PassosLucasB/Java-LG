
// Faça um programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever : F - Feminino, M - Masculino  ou Sexo Inválido


import java.util.Scanner;

public class Exer03 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra (F ou M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")){
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
