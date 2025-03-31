import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int estoqueInicial = scanner.nextInt();

        Produto produto = new Produto(nome, preco, estoqueInicial);

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        Estoque.processarVenda(produto, quantidadeVendida);

        scanner.close();
    }
}
