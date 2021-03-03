public class Exercicio4 {

    public static void main(String[] agrs) {

        int[] numeros1 = {8,9,7};
        int[] numeros2 = {4,5,6};

        int soma1 = numeros1[0] + numeros1[1] + numeros1[2];
        int soma2 = numeros2[0] + numeros2[1] + numeros2[2];

        int media1 = soma1 / 3;
        int media2 = soma2 / 3;

        float somaMedias = media1 + media2;

        float mediaMedias = somaMedias / 2;

        System.out.println("Média aritmética da soma 8+9+7 = "
                + media1);

        System.out.println("Média aritmética da soma 4+5+6 = "
                + media2);

        System.out.println("Soma das duas médias = " + somaMedias);

        System.out.println("Média das médias = " + mediaMedias);

    }
}

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias.*/
