package questao1;

public class auditoria implements observadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        System.out.println("auditoria: " + nomeProduto + " mudou de " + quantidadeAnterior + " para " + novaQuantidade + " unidades");
    }
}
