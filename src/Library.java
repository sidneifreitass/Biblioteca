
import java.util.ArrayList;
import java.util.List;

public class Library {

	static List<Book> livros = new ArrayList<>();

	public void cadastrarLivro (Book livro) {
		livros.add(livro);
	}
	
	public static List<Book> listarLivros(){
		return livros;
	}

}