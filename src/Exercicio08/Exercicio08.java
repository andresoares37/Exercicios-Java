package Exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade[] = new int[5];
		float altura[] = new float[5];

		for (int i = 0; i < idade.length; i++) {
			System.out.print("Informe a idade: ");
			idade[i] = leitor.nextInt();
			System.out.print("Informe a altura: ");
			altura[i] = leitor.nextFloat();
		}

		for (int i = 4; i >= 0; i--) {
			System.out.println("Idade: " + idade[i]);
			System.out.println("Altura: " + altura[i]);
		}

		leitor.close();
	}

}
