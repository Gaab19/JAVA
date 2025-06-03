public class ConstrutorDefault {

	String nome;
	String cargo;
	int idade;

	ConstrutorDefault(String nomeInit, String cargoInit, int idadeInit) {

		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;

	}
	ConstrutorDefault() {
	}

		public static void main(String [] args) {

		//ConstrutorDefault funcionario = new Funcionario("Gabriel Medeiros", "Desenvolvedor Jr",30);

		ConstrutorDefault funcionario = new ConstrutorDefault();
		funcionario.nome = "Gabriel Medeiros";

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("idade: " + funcionario.idade);

			}

	}
		