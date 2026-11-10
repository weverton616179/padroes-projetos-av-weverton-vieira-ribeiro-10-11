package questao1;

public interface observadorEstoque {
    void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade);
}

observer, strategy e decorator