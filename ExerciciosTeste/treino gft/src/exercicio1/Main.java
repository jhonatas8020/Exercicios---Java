package exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 5; i++) {
			list.add(sc.nextInt());		
		}
		
		int maior = Collections.max(list);
		int menor = Collections.min(list);
	
		if (maior == menor) {
			System.out.println("Os 5 numeros s�o iguais");
		}
		else {
			System.out.println("Maior numero: " + maior);
			System.out.println("Menor numero: " + menor);
		}
		
		sc.close();
	}

}
