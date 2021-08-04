package application;

import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] vect = new Pensionato[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			sc.nextLine();
			System.out.printf("Rent #%d:%n", i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Pensionato(name, email);
			System.out.println("");
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] != null) {
				
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();
		
	}

}
