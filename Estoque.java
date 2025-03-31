public class Estoque {
    public static void processarVenda(Produto produto, int quantidadeVendida) {
        System.out.println("\nProduto: " + produto.getNome());
        System.out.printf("Preço: R$ %.2f\n", produto.getPreco());
        System.out.println("Estoque antes da venda: " + produto.getEstoque() + " unidades");

        if (produto.vender(quantidadeVendida)) {
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + produto.getEstoque() + " unidades");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }
}
