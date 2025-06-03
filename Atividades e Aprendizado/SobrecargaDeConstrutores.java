public class SobrecargaDeConstrutores {

	String nome;
	String cargo;
	int idade;

	SobrecargaDeConstrutores(int idadeInit, String cargoInit, String nomeInit) {

		nome = nomeInit;
		cargo = cargoInit;
		idade = idadeInit;
	}
	SobrecargaDeConstrutores(String nomeInit, String cargoInit, int idadeInit) {
	}
	SobrecargaDeConstrutores(String nomeInit) {
	}
	SobrecargaDeConstrutores() {
	}


	public static void main(String [] args) {

		SobrecargaDeConstrutores funcionario = new SobrecargaDeConstrutores(21, "Desenvolvedor.Jr", "Gabriel Medeiros");
		SobrecargaDeConstrutores funcionario = new SobrecargaDeConstrutores(21, "Desenvolvedor.Jr", "Gabriel Medeiros");
		SobrecargaDeConstrutores funcionario = new SobrecargaDeConstrutores(21, "Desenvolvedor.Jr", "Gabriel Medeiros");

		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);
		System.out.println("====================================")
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);
		System.out.println("====================================")
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Idade: " + funcionario.idade);

	}

}