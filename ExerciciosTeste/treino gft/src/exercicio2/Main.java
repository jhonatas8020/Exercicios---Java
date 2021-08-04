package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		Icms icms = new Icms();
		Ipi ipi = new Ipi();
		Cofins cofins = new Cofins();
		
		System.out.printf("ICMS: %.2f%n", icms.calculaImposto(valor));
		System.out.printf("IPI: %.2f%n", ipi.calculaImposto(valor));
		System.out.printf("COFINS: %.2f%n", cofins.calculaImposto(valor));
	
		double total = icms.calculaImposto(valor) + ipi.calculaImposto(valor) + cofins.calculaImposto(valor);
		System.out.printf("Total: %.2f", total);
		
		sc.close();
	}

}
