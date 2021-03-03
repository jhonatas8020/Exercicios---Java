import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        int nota = input.nextInt();

        if (nota == 0) {
            System.out.println("E");

        } else if (nota <= 35) {
            System.out.println("D");

        } else if (nota <= 60) {
            System.out.println("C");

        } else if (nota <= 85) {
            System.out.println("B");

        } else {
            System.out.println("A");

        }
    }

}
