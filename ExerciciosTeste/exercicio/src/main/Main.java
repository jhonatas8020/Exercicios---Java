package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n1 = 10;
		int n = sc.nextInt();

		switch (n) {
		
		case 1:
			System.out.println(n);
			break;
			
		case 2:
			System.out.println(n);
			break;
			
		default:
			System.out.println("Invalido");
		}
		
		sc.close();
		
	}
}
