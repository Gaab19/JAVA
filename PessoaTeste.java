
public class PessoaTeste {

	public static void main(String[] args) {

		PessoaFisica pf = new PessoaFisica();

		pf.setRg(400000);
		System.out.println("Nome: " + pf.getRg());

		pf.setCpf(1000);
		System.out.println("CPF: " + pf.getCpf());

		pf.setAltura(180);
		System.out.println("Altura: " + pf.getAltura());

		pf.setCor("Negro");
		System.out.println("Cor: " + pf.getCor());

		pf.setCnh(000);
		System.out.println("CNH: " + pf.getCnh());

		pf.setEstadoCivil("Solteiro");
		System.out.println("Estado Civil: " + pf.getEstadoCivil());

		pf.setFilhos(12);
		System.out.println("Filhos: " + pf.getFilhos());

		pf.setNomemae("Sibirina");
		System.out.println("Nome da Mãe: " + pf.getNomemae());

		pf.setNomepai("Toninho Tornado");
		System.out.println("Nome do Pai: " + pf.getNomepai());

	}

}
