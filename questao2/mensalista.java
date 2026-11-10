package questao2;

public class mensalista implements perfilCobranca {
    private static final double valorFixo = 180.0;

    @Override
    public double calcular(int minutos) {
        return valorFixo;
    }

    @Override
    public String descricao() {
        return "mensalista";
    }
}
