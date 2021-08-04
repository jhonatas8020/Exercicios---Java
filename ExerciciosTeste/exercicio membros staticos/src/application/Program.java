package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		CurrencyConverter.cotacao = sc.nextDouble();
		
		System.out.printf("How many dollars will be bought? ");
		double dolar = sc.nextDouble();
		double result = CurrencyConverter.calculo(dolar);
		
		System.out.println("Amount to be paid in reais = " + result);
		
		sc.close();

	}

}
