import java.util.Scanner;

public class IfElse {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a  idade");
        int idade = scan.nextInt();
        if (idade >= 19){
            System.out.println("É maior de idade.");
        }else{
            System.out.println("Não é maior de idade.");
        }
    }
}
