import java.util.Scanner;

import funcoes.Livro;
import funcoes.Biblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca bibli = new Biblioteca("Biblioteca_douglas");
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("1 - Listar Livros da biblioteca");
            System.out.println("2 - Adicionar Livro");
            System.out.println("3 - Remover Livro");
            System.out.println("4 - Total de livros");
            System.out.println("5 - Lista de autores");
            System.out.println("0 - Sair");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1 -> Biblioteca.listarLivros();
                case 2 -> {
                    System.out.println("Digite o id do livro");
                    int id = sc.nextInt();

                    System.out.println("Digite o titulo do livro");
                    String titulo = sc.next();

                    System.out.println("Digite o nome do autor do livro");
                    String autor = sc.next();

                    System.out.println("Digite a categoria do livro");
                    int categoria = sc.nextInt();

                    System.out.println("Digite a data de publicacao do livro");
                    String dataPublicacao = sc.next();

                    Livro livro = new Livro(id, titulo, autor, categoria, dataPublicacao);

                    Biblioteca.addLivro(livro);
                }
                case 3 -> {
                    System.out.println("Digite o id do livro");
                    int id = sc.nextInt();
                    Biblioteca.removeLivro(id);
                }
                case 4 -> Biblioteca.verificaTotalLivros();
                case 5 -> Biblioteca.listarAutoresMaiorParaMenor();
            }
        } while (escolha != 0);

        sc.close();
    }
}