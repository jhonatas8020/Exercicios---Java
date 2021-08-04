package exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
		int maior = Collections.max(list);
		int menor = Collections.min(list);
		
		if (maior == menor) {
			System.out.println("Os 5 números são iguais");
		}
		else {
			System.out.println("Maior: " + maior);
			System.out.println("Menor: " + menor);
		}
		
		sc.close();
	}

}
