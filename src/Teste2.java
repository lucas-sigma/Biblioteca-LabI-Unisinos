
public class Teste2 {

	public static void main(String[] args) {
		Livro[] livros = new Livro[5];
		
		livros[0] = new Livro("Iron Man", "Stan Lee", "101", 200);
		System.out.println(livros[0].getNomeLivro());
		
		for (int i = 0; i < livros.length; i++) {
			System.out.println("Nome: " + livros[i].getNomeLivro() + "\nAutor: " + livros[i].getNomeAutor() + "\nEditora: " + "\nPaginas: " + livros[i].getNumPaginas());
		}
	}

}
