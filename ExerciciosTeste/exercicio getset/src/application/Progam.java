package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int nConta = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String tConta = sc.nextLine();
		
		System.out.printf("Is there na initial deposit (y/n)? ");
		char confirm = sc.next().charAt(0);
		
		if (confirm == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double inicialDeposito = sc.nextDouble();
			conta = new Conta(nConta, tConta, inicialDeposito);
		}
		
		else {
			
			conta = new Conta(nConta, tConta);
		}
	
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double vDeposito = sc.nextDouble();
		conta.deposito(vDeposito);
		
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		double vSaque = sc.nextDouble();
		
		if (vSaque > 0) {
			
			conta.saque(vSaque);
		}
		
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
