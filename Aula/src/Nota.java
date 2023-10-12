
public class Nota {

	public static void main(String[] args) {
		int nota = 5;

		if (nota >= 9.0) {
			System.out.println("Excelente!");
		} else {
			if (nota >= 8.0) {
				System.out.println("Parabens!");
			} else {
				if (nota >= 6.0) {
					System.out.println("Muito Bom!");

				} else {
					System.out.println("Reprovado!");

				}
			}

		}
	}

}