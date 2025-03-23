package funcoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Biblioteca {
    private String nomeBiblioteca;
    private static Livro[] livros = new Livro[10];
    private static int totalLivros;


    public Biblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        this.totalLivros = 0;
    }

    public static Boolean addLivro(Livro livro){
        for (int i = 0; i <livros.length; i++){
            if (livros[i] == null){
                livros[i] = livro;
                totalLivros++;
                return true;
            }
        }
        return false;
    }

    public static void listarLivros(){
        for (int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }
    }

    public static void removeLivro(int id){
        for (int i = 0; i < livros.length; i++){
            if (livros[i].getId() == id) {
                livros[i] = null;
                totalLivros--;
                System.out.println("Livro removido com sucesso");
                return;
            }
        }
        System.out.println("id não encontrado");
    }

    public static void verificaTotalLivros(){
        System.out.println("O total de livros é: " + totalLivros);
    }

    public static void listarAutoresMaiorParaMenor(){
        List<String> listaAutores = new ArrayList<>();

        for (int i = 0; i < livros.length; i++){
            if (livros[i] != null ){
                listaAutores.add(livros[i].getAutor());
            }
        }

        HashSet<String> autoresUnicos = new HashSet<>();

        for ( String autor : listaAutores ){
            if (autoresUnicos.add(autor)){
                System.out.println(autor);
            }
        }
    }
}
