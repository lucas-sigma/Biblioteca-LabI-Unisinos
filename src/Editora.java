
public class Editora extends Livro {
	private String nomeEditora, codEditora;

	public Editora() {
		
	}
	
	public Editora(String nomeEditora, String codEditora) {
		super();
		this.nomeEditora = nomeEditora;
		this.codEditora = codEditora;
	}

	public String toString() {
		return "Editora: " + getNomeEditora() + "\nCod. Editora: " + getCodEditora();
	}
	
	// Métodos mutantes
	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}

	public String getCodEditora() {
		return codEditora;
	}

	public void setCodEditora(String codEditora) {
		this.codEditora = codEditora;
	}


}
