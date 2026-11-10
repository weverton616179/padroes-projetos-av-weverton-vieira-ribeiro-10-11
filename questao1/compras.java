package questao1;

public class compras implements observadorEstoque {
    private static final int limiteEstoqueBaixo = 5;

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < limiteEstoqueBaixo) {
            System.out.println("compras: " + nomeProduto + " com estoque baixo, " + novaQuantidade + " unidades");
        }
    }
}
