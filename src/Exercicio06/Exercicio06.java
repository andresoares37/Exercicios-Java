package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int alunos[] = new int[10];
		int contador = 0;
		double media = 0;
		double total = 0;

		for (int i = 0; i < alunos.length; i++) {

			System.out.println("Digite a nota do aluno " + (i + 1) + ":");
			double nota = leitor.nextDouble();
			total += nota;
			
			if (nota >= 7) {
				contador++;
			}
			media = total / alunos.length;
		}
		System.out.println("Quantidade de notas maior que 7.0: " + contador);
		System.out.println("A média da sala foi: " + media);
		leitor.close();
	}

}
