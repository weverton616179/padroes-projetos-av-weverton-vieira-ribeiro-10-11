package questao1;

import java.util.ArrayList;
import java.util.List;

public class produto {
    private final String nome;
    private int quantidade;
    private final List<observadorEstoque> observadores;

    public produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(observadorEstoque observador) {
        observadores.add(observador);
    }

    public void removerObservador(observadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade == quantidade) {
            return;
        }
        int quantidadeAnterior = quantidade;
        quantidade = novaQuantidade;
        for (observadorEstoque observador : observadores) {
            observador.atualizar(nome, quantidadeAnterior, novaQuantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
