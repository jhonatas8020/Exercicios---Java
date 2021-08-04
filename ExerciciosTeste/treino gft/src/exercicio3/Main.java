package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso = sc.nextDouble();
		double valor = sc.nextDouble();
		int distancia = sc.nextInt();
		
		Vagao vagao = new Vagao(valor, peso);
		Caminhao caminhao = new Caminhao(valor, peso);
		
		System.out.printf("Frete Vagão: $%.2f%n", vagao.calculaFrete(distancia));
		System.out.printf("Frete Caminhão: $%.2f%n", caminhao.calculaFrete(distancia));
		sc.close();
	}

}
