import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner leitura = new Scanner(System.in);
        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("""
                    
                    ===Minha Biblioteca===
                    1. Adicionar livro
                    2. Listar livros
                    3. Marcar como lido
                    4. Sair
                    
                    Escolha uma opção:
                    
                    """);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu adicionar um livro");
                    leitura.nextLine();
                    System.out.println("Titulo: ");
                    String titulo = leitura.nextLine();
                    System.out.println("Autor: ");
                    String autor = leitura.nextLine();
                    System.out.println("Ano: ");
                    int ano = leitura.nextInt();
                    Livro livro = new Livro(titulo, autor, ano, false);
                    listaDeLivros.add(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("Você escolheu listar livros");
                    if (listaDeLivros.isEmpty()) {
                        System.out.println("A lista está vazia");
                    }
                    for (Livro livro1:listaDeLivros){
                    System.out.println("Titulo: " + livro1.getTitulo());
                    System.out.println("Autor: " + livro1.getAutor());
                    System.out.println("Ano" + livro1.getAno());
                        System.out.println(livro1.isLido() ? "Lido":"Não lido");
                        System.out.println();
                }
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("Você escolheu marcar como lido");
                    for (int i = 0; i < listaDeLivros.size(); i++) {
                        System.out.println((i + 1) + " - " + listaDeLivros.get(i).getTitulo());
                    }
                    int opcaoLista = leitura.nextInt();
                    Livro livroEscolhido = listaDeLivros.get(opcaoLista-1);
                    livroEscolhido.marcarComoLido();
                    System.out.println("Livro marcado como lido!");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("Você escolheu sair");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Opção inválida!");
            }
        }
    }
}
