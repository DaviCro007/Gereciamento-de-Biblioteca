package GerenciamentoBiblioteca;

public class Emprestimo {
    private Livro livro;
    private String leitor;
    private String data;

    // Construtor: cria um empréstimo com o livro, leitor e data
    public Emprestimo(Livro livro, String leitor, String data) {
        this.livro = livro;
        this.leitor = leitor;
        this.data = data;
    }

    // Métodos para acessar os dados do empréstimo
    public Livro getLivro() { return livro; }
    public String getLeitor() { return leitor; }
    public String getData() { return data; }

    // Mostra as informações do empréstimo em texto
    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + " - Leitor: " + leitor + " - Data: " + data;
    }
}