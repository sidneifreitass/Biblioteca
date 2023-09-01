
import java.util.ArrayList;
import java.util.List;

class Book{
	String titulo;
	double preco;
	List<Author> autores = new ArrayList<>();
	
	public Book(String titulo, double preco) {
		this.titulo = titulo.toLowerCase();
		this.preco = preco;
	}
	
	public void addAutor(Author autor) {
		autores.add(autor);
	}
}