import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        if(titulo.length() > 2) {
            this.titulo = titulo;
        } else {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        if(autor.split("\\s").length > 1) {
            this.autor = autor;
        } else {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        if(preco > 0) {
            this.preco = preco;
        } else {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
    }
}
