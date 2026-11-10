package questao2;

public class conveniado implements perfilCobranca {
    private static final int minutosGratuitos = 30;
    private static final double valorHora = 8.0;
    private static final double desconto = 0.25;

    @Override
    public double calcular(int minutos) {
        if (minutos <= minutosGratuitos) {
            return 0.0;
        }
        int horas = (int) Math.ceil((minutos - minutosGratuitos) / 60.0);
        return horas * valorHora * (1 - desconto);
    }

    @Override
    public String descricao() {
        return "conveniado";
    }
}
