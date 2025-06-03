public class Funcionarios {

		String nome;
		String cargo;
		int idade;

		Funcionarios(String nomeInit, String cargoInit, int idadeInit) {

			nome = nomeInit;
			cargo = cargoInit;
			idade = idadeInit;
		}

		public static void main(String [] args) {


			Funcionarios funcionario1 = new Funcionarios("Gabriel Medeiros", "Desenvolvedor.Jr",21);

			Funcionarios funcionario2 = new Funcionarios("Itallo Edward", "Desenvolvedor.Jr",21);

			System.out.println("Nome: " + funcionario1.nome);
			System.out.println("Cargo: " + funcionario1.cargo);
			System.out.println("Idade: " + funcionario1.idade);
			System.out.println("------------------------------------");
			System.out.println("Nome: " + funcionario2.nome);
			System.out.println("Cargo: " + funcionario2.cargo);
			System.out.println("Idade: " + funcionario2.idade);

		}

	}