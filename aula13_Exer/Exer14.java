import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo");
        double tamArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("O tempo de download: " + tempo);
    }
}
