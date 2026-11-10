package questao1;

public class vendas implements observadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("vendas: " + nomeProduto + " voltou a ter estoque, " + novaQuantidade + " unidades");
        }
    }
}
