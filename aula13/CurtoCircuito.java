public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = f & falso;
        boolean resultado2 = verdadeiro && falso;
        System.out.println(resultado1);
        System.out.println(resultado2);

        int resultado = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado);
    }

}