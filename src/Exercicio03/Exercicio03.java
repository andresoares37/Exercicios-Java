package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		float vet[] = new float[4];
		float media = 0;
		float total = 0;

		for (int i = 0; i < 4; i++) {
			System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
			vet[i] = leitor.nextFloat();
			total += vet[i];
			media = total / vet.length;
			System.out.println("Nota do aluno " + (i + 1) + ": " + vet[i]);

		}
		System.out.println("A média da sala é: " + media);
		System.out.println();
		
		leitor.close();

	}

}
