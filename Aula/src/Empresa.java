
public class Empresa {

	public static void main(String[] args) {

		int jan = 15000;
		int fev = 23000;
		int mar = 17000;
		int soma = (jan + fev + mar);

		System.out.println(soma);

		if (soma >= 50000) {
			System.out.println("Gasto Trimestral");

		} else {
			System.out.println("Gasto Estourado");

		}

	}

}
