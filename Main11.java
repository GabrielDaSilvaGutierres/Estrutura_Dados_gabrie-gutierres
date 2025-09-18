public class Main11 {
    public static void main(String[] args) {

        int[][] vendas = {
            {10, 5, 8, 12},
            {7, 9, 6, 10},
            {14, 3, 11, 7}
        };
        
        String[] produtos = {"Camisas", "Calças", "Jaquetas", "Sapatos"};
        int totalLoja = 0;
        int[] totalPorVendedor = new int[3];
        int[] totalPorProduto = new int[4];
        
            for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totalLoja += vendas[i][j];
                totalPorVendedor[i] += vendas[i][j];
                totalPorProduto[j] += vendas[i][j];
            }
        }
 
        System.out.println("Total de peças vendidas pela loja: " + totalLoja);
 
        for (int i = 0; i < totalPorVendedor.length; i++) {
            System.out.println("Vendedor " + (i + 1) + " vendeu: " + totalPorVendedor[i] + " peças");
        }
 
        for (int j = 0; j < totalPorProduto.length; j++) {
            System.out.println(produtos[j] + " vendidas: " + totalPorProduto[j]);
        }
 
        int maxVendas = totalPorVendedor[0];
        int melhorVendedor = 1;
        for (int i = 1; i < totalPorVendedor.length; i++) {
            if (totalPorVendedor[i] > maxVendas) {
                maxVendas = totalPorVendedor[i];
                melhorVendedor = i + 1;
            }
        }
        System.out.println("Vendedor que mais vendeu: Vendedor " + melhorVendedor);
 
        int maxProduto = totalPorProduto[0];
        int produtoMaisVendido = 0;
        for (int j = 1; j < totalPorProduto.length; j++) {
            if (totalPorProduto[j] > maxProduto) {
                maxProduto = totalPorProduto[j];
                produtoMaisVendido = j;
            }
        }
        System.out.println("Produto mais vendido: " + produtos[produtoMaisVendido]);
    }
}