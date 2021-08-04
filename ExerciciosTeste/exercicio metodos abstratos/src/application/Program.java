package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuintes;
import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.printf("Individual or company (i/c)?");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double hExp = sc.nextDouble();
				
				list.add(new Fisica(name, anualIncome, hExp));
			}
			else {
				System.out.print("Number of employees: ");
				int nEmployees = sc.nextInt();
				
				list.add(new Juridica(name, anualIncome, nEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Contribuintes c : list) {
			System.out.println(c.getNome() + String.format(": $ %.2f", c.calculaImposto()));
		}
		
		sc.close();
		
	}

}
