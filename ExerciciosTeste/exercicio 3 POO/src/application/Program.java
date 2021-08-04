package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		if (aluno.notaFinal() >= 60) {
			
			System.out.printf("FINAL GRADE = %.2f%nPASS", aluno.notaFinal());
		}
		
		else {
			
			System.out.printf("FINAL GRADE = %.2f%nFAILED %nMISSING %.2f POINTS", aluno.notaFinal(), aluno.failed());
		}
		
		sc.close();
		
	}

}
