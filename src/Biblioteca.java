
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
		try {
			for (int i = 0; i < this.editoras.length; i++)
				if (this.editoras[i].getNomeEditora().equalsIgnoreCase(nome)) {
					for (int j = 0; j < this.livros.length; j++)
						if (this.livros[j].getCodEditora().equalsIgnoreCase(this.editoras[i].getCodEditora()))
							this.livros[j] = null;
					this.editoras[i] = null;
					return true;
				}
		} catch (Exception NullPointerException) {
			System.out.println("Erro ao tentar encontrar a editora.");
		} finally {
			return false;
		}

	}

	public void listaLivros() {
		String editora = "";
		System.out.println("Teste len.editora: " + this.editoras.length);
		System.out.println("[0] ==> " + this.editoras[0]);
		/*
		 * System.out.println("[1] ==> " + this.editoras[1].getCodEditora());
		 * System.out.println("[2] ==> " + this.editoras[2].getCodEditora());
		 * System.out.println("[3] ==> " + this.editoras[3].getCodEditora());
		 */
		for (int i = 0; i < this.livros.length; i++) {
			// for (int j = 0; j < this.editoras.length; j++) {
			/*
			 * if (this.editoras[j].getCodEditora().equals(this.livros[i].getCodEditora()))
			 * { editora = this.editoras[j].getNomeEditora(); break; }
			 */
			// }
			if (livros[i] != null)
				System.out.println("Nome: " + livros[i].getNomeLivro() + "\nAutor: " + livros[i].getNomeAutor()
						+ "\nPaginas: " + livros[i].getNumPaginas() + "\nEditora: " + editora);
		}
	}

	public boolean insereEditora(Editora editora) {
		for (int i = 0; i < this.editoras.length; i++) {
			if (editoras[i] == null) {
				this.editoras[i] = editora;
				return true;
			}
		}
		return false;
	}

	public boolean removeEditora(String cod) {
		for (int i = 0; i < editoras.length; i++)
			if (this.editoras[i].getCodEditora().equalsIgnoreCase(cod)) {
				this.editoras[i] = null;
				return true;
			}
		return false;

	}

	public void listaEditoras() {
		for (int i = 0; i < editoras.length; i++)
			editoras[i].toString();
	}

}
