package questao3;

public class leite extends complemento {
    private static final double valor = 1.5;

    public leite(bebida base) {
        super(base);
    }

    @Override
    public String descricao() {
        return base.descricao() + ", leite";
    }

    @Override
    public double preco() {
        return base.preco() + valor;
    }
}
