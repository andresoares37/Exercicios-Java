
package Exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {

		String vet[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		int a = vet.length;
		for (int i = 0; i < vet.length; i++) {

			switch (vet[i]) {
			case "a":
				a--;
				break;
			case "e":
				a--;
                break;
			case "i":
				a--;
                break;
			case "o":
				a--;
                break;
			case "u":
				a--;
                break;
			default:
				System.out.println(vet[i]);				
				break;				
			}			
		}			
		System.out.println(a);
	}
}
