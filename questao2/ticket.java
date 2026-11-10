package questao2;

public class ticket {
    private final String placa;
    private final int minutos;
    private perfilCobranca perfil;

    public ticket(String placa, int minutos, perfilCobranca perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }

    public void alterarPerfil(perfilCobranca novoPerfil) {
        this.perfil = novoPerfil;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getPerfil() {
        return perfil.descricao();
    }
}
