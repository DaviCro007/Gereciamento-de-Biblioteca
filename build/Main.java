package Trabalho;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do{
            System.out.println("****************************************");
            System.out.println("                MENU                    ");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Devolver Livro");
            System.out.println("0. Sair");
            System.out.println("****************************************");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.print("\n");

            switch(opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    biblioteca.cadastrarLivro(new Livro(id, titulo, autor));
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("ID do livro: ");
                    int idEmp = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome do leitor: ");
                    String leitor = sc.nextLine();
                    biblioteca.realizarEmprestimo(idEmp, leitor, "14/09/2026");
                    break;
                case 4:
                    System.out.print("ID do livro: ");
                    int idDev = sc.nextInt(); sc.nextLine();
                    biblioteca.devolverLivro(idDev);
                    break;
                case 0:
                    System.out.println("Volte Logo!");
            }
        } while(opcao != 0);

        sc.close();
        }
    }

