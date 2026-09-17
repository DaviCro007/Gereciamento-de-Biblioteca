package GerenciamentoBiblioteca;

public class Livro {
    
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor: cria um livro com id, título e autor, e marca como disponível
    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    // Métodos para acessar os dados do livro
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel;}

    // Mostra as informações do livro em texto
    @Override
    public String toString() {
        return id + " - " + titulo + " (" + autor + ") - " + (disponivel ? "Disponível" : "Emprestado");
    }
}