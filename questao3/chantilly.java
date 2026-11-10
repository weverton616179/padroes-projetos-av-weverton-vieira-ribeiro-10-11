package questao3;

public class chantilly extends complemento {
    private static final double valor = 2.0;

    public chantilly(bebida base) {
        super(base);
    }

    @Override
    public String descricao() {
        return base.descricao() + ", chantilly";
    }

    @Override
    public double preco() {
        return base.preco() + valor;
    }
}
