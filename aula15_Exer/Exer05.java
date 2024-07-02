
/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve carlcular a média alcançada por aluno e apresentar:
 a) A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 b) A mensagem "Reprovado", se a média for menor do que sete;
 c) A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) /2;

        if (media == 10){
            System.out.println("Aprovado com distinção");
        } else if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }


}
