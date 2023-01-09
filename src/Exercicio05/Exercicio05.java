package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numero[] = new int[10];
		int par[] = new int[10];
		int impar[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 números: ");
			for (int j = 0; j < 10; j++) {
				int n = leitor.nextInt();
				numero[j] = n;
				if (n % 2 == 0) {
					par[j] = numero[j];
				} else {
					impar[j] = numero[j];
				}				
			}
			System.out.println();
			System.out.print("Números lidos: ");
			for (int k = 0; k < 10; k++) {
				System.out.println(numero[k]);
			}
			System.out.println();
			System.out.print("Números pares: ");
			for (int k = 0; k < 10; k++) {
				System.out.println(par[k]);
			}
			System.out.println();
			System.out.println("Números ímpares");
			for (int k = 0; k < 10; k++) {
				System.out.println(impar[k]);
			}
		}

		leitor.close();
	}

}
