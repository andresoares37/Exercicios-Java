package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int vet[] = new int[5];
		int soma = 0;
		int multiplicacao = 1;
		
		for (int i = 0; i < 5; i++) {
			vet[i] = leitor.nextInt();			
			soma += vet[i];
			multiplicacao *= vet[i];
		}
		System.out.println("Soma dos números: " + soma);
		System.out.println("Multiplicação dos números: " + multiplicacao);
		System.out.print("Numeros informados: ");
		for (int i = 0; i < 5; i++) {
			 System.out.print(vet[i]);
		}

		leitor.close();
	}

}
