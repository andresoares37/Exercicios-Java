package Exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double vet[] = new double[2];
		double quadrado[] = new double[2];
		double soma = 0;

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Informe o número: ");
			vet[i] = leitor.nextInt();
			quadrado[i] = Math.pow(vet[i], 2);
			soma = soma + quadrado[i];		
		}
		System.out.println(soma);
		leitor.close();
	}

}
