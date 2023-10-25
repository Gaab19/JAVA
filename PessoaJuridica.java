
public class PessoaJuridica extends Pessoa{

	private int Juridica;
	private String cnpj;
	private String razaSocial;
	private String renda;
	private String im;
	private String ie;
	private String capitalSocial;

	public int getJuridica() {
		return Juridica;
	}

	public void setJuridica(int juridica) {
		Juridica = juridica;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaSocial() {
		return razaSocial;
	}

	public void setRazaSocial(String razaSocial) {
		this.razaSocial = razaSocial;
	}

	public String getRenda() {
		return renda;
	}

	public void setRenda(String renda) {
		this.renda = renda;
	}

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(String capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

}
