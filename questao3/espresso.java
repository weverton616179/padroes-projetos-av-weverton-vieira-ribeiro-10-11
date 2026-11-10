package questao3;

public class espresso implements bebida {
    private static final double precoBase = 6.0;

    @Override
    public String descricao() {
        return "espresso";
    }

    @Override
    public double preco() {
        return precoBase;
    }
}
