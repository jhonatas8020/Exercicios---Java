package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.FormaGeometrica;
import entities.Quadrado;
import entities.Retangulo;
import entities.Trapezio;
import entities.TrianguloRetangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0 ) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
