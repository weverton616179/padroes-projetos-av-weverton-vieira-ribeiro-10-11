package questao3;

public class cha implements bebida {
    private static final double precoBase = 5.0;

    @Override
    public String descricao() {
        return "cha";
    }

    @Override
    public double preco() {
        return precoBase;
    }
}
