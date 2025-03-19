
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nOpção de cadastro selecionada\n ");

                    System.out.print("insira o código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Insira o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Isira o preço: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(codigo, nome, preco);
                    produtos.add(produto);
                    System.out.println("O produto foi cadastrado :)");
                    break;

                case 2:
                    System.out.print("\nOpção de busca selecionada\n ");

                    System.out.print("Insira o código: ");
                    int codigoBusca = scanner.nextInt();

                    Produto produtoEncontrado = null;
                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigoBusca) {
                            produtoEncontrado = p;
                            break;
                        }
                    }

                    if (produtoEncontrado != null) {
                        System.out.println("Produto: " + produtoEncontrado);
                    } else {
                        System.out.println("Produto não foi encontrado :(");
                    }
                    break;

                case 3:
                    System.out.println("\nSaindo...\n");
                    break;

                default:
                    System.out.println("Opção inválida :(");
            }
        } while (opcao != 3);

        scanner.close();
    }
}