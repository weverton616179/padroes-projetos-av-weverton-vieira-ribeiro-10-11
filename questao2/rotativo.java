package questao2;

public class rotativo implements perfilCobranca {
    private static final double valorHora = 10.0;

    @Override
    public double calcular(int minutos) {
        return horasIniciadas(minutos) * valorHora;
    }

    @Override
    public String descricao() {
        return "rotativo";
    }

    private int horasIniciadas(int minutos) {
        return (int) Math.ceil(minutos / 60.0);
    }
}
