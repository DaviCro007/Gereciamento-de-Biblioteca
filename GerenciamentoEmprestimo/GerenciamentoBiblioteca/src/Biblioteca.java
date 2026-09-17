package GerenciamentoBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> acervo = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    // Adiciona um livro ao acervo com validação de ID
    public void cadastrarLivro(Livro livro) {
        for (Livro l : acervo) {
            if (l.getId() == livro.getId()) {
                System.out.println("Erro: Já existe um livro com o ID " + livro.getId());
            return;
        }
    }
    acervo.add(livro);
    System.out.println("Livro cadastrado com sucesso!");
}

    // Lista todos os livros
    public void listarLivros() {
        for (Livro l : acervo) {
            System.out.println(l);
        }
    }

    // Realiza o empréstimo de um livro
    public void realizarEmprestimo(int id, String leitor, String data) {
        for (Livro l : acervo) {
            if (l.getId() == id) {
                if (l.isDisponivel()) {
                    l.setDisponivel(false);
                    emprestimos.add(new Emprestimo(l, leitor, data));
                    System.out.println("Empréstimo realizado!");
                } else {
                    System.out.println("Livro já emprestado!");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    // Devolve um livro
    public void devolverLivro(int id) {
        for (Livro l : acervo) {
            if (l.getId() == id) {
                if (!l.isDisponivel()) {
                    l.setDisponivel(true);
                    System.out.println("Devolução realizada!");
                } else {
                    System.out.println("Livro já está disponível!");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }
    
}