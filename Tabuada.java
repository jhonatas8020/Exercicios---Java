import java.util.Scanner;

public class Tabuada {
    public static void main(String[] agrs) {

        Scanner digitado = new Scanner(System.in);
        int numero;
        int tabuada = 1;

        System.out.println("Informe o numero da tabuada: ");
        numero = digitado.nextInt();

        while (tabuada<=10) {
            System.out.println(numero + "x" + tabuada + " = " + numero * tabuada);
            tabuada++;
        }
    }
}
