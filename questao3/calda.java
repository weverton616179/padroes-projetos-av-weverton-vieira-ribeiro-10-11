package questao3;

public class calda extends complemento {
    private static final double valor = 1.0;

    public calda(bebida base) {
        super(base);
    }

    @Override
    public String descricao() {
        return base.descricao() + ", calda";
    }

    @Override
    public double preco() {
        return base.preco() + valor;
    }
}
