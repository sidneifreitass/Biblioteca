
import java.util.List;

import javax.swing.JOptionPane;

public class MainLibrary {

    public static void main(String[] args) {
        Library library = new Library();

        String menu = "1 - Cadastrar livro\n" + "2 - Listar livros\n" + "3 - Cancelar/sair";

        int opcao = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            if (opcao == 1) {
                String titulo = JOptionPane.showInputDialog(null, "Digite o título do livro: ");
                double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do livro: "));

                Book livro = new Book(titulo, preco);

                int numAutores = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos autores têm o livro? "));

                for (int i = 0; i < numAutores; i++) {
                    String nomeAutor = JOptionPane.showInputDialog(null, "Digite o nome do autor: ");
                    String sexoAutor = JOptionPane.showInputDialog(null, "Digite o sexo do autor: ");
                    int idadeAutor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do autor: "));

                    Author autor = new Author(nomeAutor, sexoAutor, idadeAutor);
                    livro.addAutor(autor);
                }

                library.cadastrarLivro(livro);
            }

            if (opcao == 2) {
                List<Book> livrosCadastrados = library.listarLivros();
                StringBuilder livrosInfo = new StringBuilder("Livros cadastrados:\n");

                for (Book l : livrosCadastrados) {
                    livrosInfo.append("Título: ").append(l.titulo).append(", Preço: R$").append(l.preco).append("\nAutores:\n");
                    for (Author autor : l.autores) {
                        livrosInfo.append(autor.nome).append("\n");
                    }
                    livrosInfo.append("\n");
                }

                JOptionPane.showMessageDialog(null, livrosInfo.toString());
            }

        } while (opcao != 3);
    }
}