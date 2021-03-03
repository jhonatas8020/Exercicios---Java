import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] agrs) {

        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int soma;

        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        soma = n1 + n2;

        System.out.println("O resultado é: " + soma);
    }
}
