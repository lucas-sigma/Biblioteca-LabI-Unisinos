
public class Biblioteca extends Editora {
	private Livro[] livros;
	private Editora[] editoras;
	private int totLivros, tamLivros, totEdits, tamEdits;

	public Biblioteca(int totLivros, int totEdits) {
		super();
		this.livros = new Livro[totLivros];
		this.editoras = new Editora[totEdits];
	}

	public boolean insereLivro(Livro livro) {
		for (int i = 0; i < this.livros.length; i++) {
			if (livros[i] == null) {
				this.livros[i] = livro;
				return true;
			}
			System.out.println(livros[i]);
		}
		return false;
	}

	public boolean removeLivroPeloNome(String nome) {
		for (int i = 0; i < this.livros.length; i++)
			if (this.livros[i].getNomeLivro().equalsIgnoreCase(nome)) {
				this.livros[i] = null;
				return true;
			}
		return false;
	}

	public boolean removeLivroPelaEditora(String nome) {
		for (int i = 0; i < this.editoras.length; i++)
			if (this.editoras[i].getNomeEditora().equalsIgnoreCase(nome)) {
				this.editoras[i] = null;
				return true;
			}
		return false;

	}

	public void listaLivros() {

		for (int i = 0; i < this.livros.length; i++) {
			if (livros[i] != null)
				System.out.println("Nome: " + livros[i].getNomeLivro() + "\nAutor: " + livros[i].getNomeAutor()
						+ "\nPaginas: " + livros[i].getNumPaginas());
		}

		/*
		 * System.out.println("Nome: " + livros[0].getNomeLivro());
		 * System.out.println("Autor: " + livros[0].getNomeAutor()); //
		 * System.out.println("Editora: " + editoras[0].getNomeEditora());
		 * System.out.println("Paginas: " + livros[0].getNumPaginas());
		 */

	}

	public boolean insereEditora(Editora editora) {
		if (this.editoras.length < this.totEdits) {
			this.editoras[this.totEdits] = editora;
			return true;
		}
		return false;
	}

	public boolean removeEditora(String cod) {
		if (this.editoras.length > 0) {
			for (int i = 0; i < editoras.length; i++)
				if (this.editoras[i].getCodEditora().equalsIgnoreCase(cod)) {
					for (int j = i; j < editoras.length; j++) {
						this.editoras[j] = this.editoras[j + 1];
						for (int k = 0; k < livros.length; k++) {
							if (this.livros[k].getCodEditora().equalsIgnoreCase(cod))
								this.livros[k] = this.livros[k + 1];
						}
					}
					break;
				}
			return true;
		}
		return false;
	}

	public void listaEditoras() {
		for (int i = 0; i < editoras.length; i++) {
			editoras[i].toString();
		}
	}

}
