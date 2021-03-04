import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;
        int antecessor;
        int sucessor;

        System.out.println("Digite um número: ");
        numero = input.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Número digitado: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

    }

}

/* Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor. */