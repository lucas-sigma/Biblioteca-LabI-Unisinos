import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca(4, 4);
		Scanner sc = new Scanner(System.in);

		int op = 0;

		do {
			System.out.print("\n ============ Menu ============\n\n\t1- Insere livro" + "\n\t2- Remove livro pelo nome"
					+ "\n\t3- Remove livro pela editora" + "\n\t4- Lista livros" + "\n\t5- Insere editora"
					+ "\n\t6- Remove editora" + "\n\t7- Lista editoras" + "\n\t0- Encerra execucao"
					+ "\n\n*Digite o numero " + "correspondente a sua opcao: ");

			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.print("Numero de paginas: ");
				int numPaginas = sc.nextInt();
				sc.nextLine();
				System.out.print("Livro: ");
				String nomeLivro = sc.nextLine();
				System.out.print("Autor: ");
				String nomeAutor = sc.nextLine();
				System.out.print("Cod. Editora: ");
				String codEditora = sc.nextLine();
				Livro l = new Livro(nomeLivro, nomeAutor, codEditora, numPaginas);
				System.out.println(b1.insereLivro(l));
				break;
			case 2:
				sc.nextLine();
				System.out.print("Livro a ser removido: ");
				String nome = sc.nextLine();
				System.out.println(b1.removeLivroPeloNome(nome));
				break;
			case 3:
				sc.nextLine();
				System.out.print("Editora a ser removida: ");
				String editora = sc.nextLine();
				System.out.println(b1.removeLivroPelaEditora(editora));
				break;
			case 4:
				b1.listaLivros();
				break;
			case 5:
				sc.nextLine();
				System.out.print("Nome da editora: ");
				String nomeEditora = sc.nextLine();
				System.out.print("Codigo da editora: ");
				String codeEditora = sc.nextLine();
				Editora e = new Editora(nomeEditora, codeEditora);
				System.out.println(b1.insereEditora(e));
				break;
			case 6:
				sc.nextLine();
				System.out.print("Codigo da editora: ");
				String delEditora = sc.nextLine();
				System.out.println(b1.removeEditora(delEditora));
				break;
			case 7:
				b1.listaEditoras();
				break;
			case 0:
				System.out.println("\n\n ============ Encerrado ============\n");
				break;
			default:
				System.out.println("\n\n\t\t====== Opcao Invalida ======\n");
			}
		} while (op > 0 && op < 8);
	}

}
