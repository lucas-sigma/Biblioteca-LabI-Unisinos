
public class Livro {
	private String nomeLivro, nomeAutor, codEditora;
	private int numPaginas;
	
	public Livro() {
		
	}

	public Livro(String nomeLivro, String nomeAutor, String codEditora, int numPaginas) {
		super();
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
		this.codEditora = codEditora;
		this.numPaginas = numPaginas;
	}

	public String toString() {
		return "Livro: " + getNomeLivro() + "\nAutor: " + getNomeAutor() + "\nCod. Editora: " + getCodEditora() + "\nPaginas: " + getNumPaginas();
	}

	// Métodos mutantes
	public String getNomeLivro() {
		return nomeLivro;
	}


	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}


	public String getCodEditora() {
		return codEditora;
	}


	public void setCodEditora(String codEditora) {
		this.codEditora = codEditora;
	}


	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	
}
