package questao2;

import java.util.Locale;

public class principal {
    public static void main(String[] args) {
        System.out.println("----- questao 2: tarifa de estacionamento -----");
        System.out.println();

        ticket tiquete = new ticket("abc1234", 100, new rotativo());
        System.out.println("tiquete " + tiquete.getPlaca() + " com " + tiquete.getMinutos() + " minutos");
        System.out.println("perfil " + tiquete.getPerfil() + ": " + formatar(tiquete.calcularValor()));

        tiquete.alterarPerfil(new mensalista());
        System.out.println("perfil " + tiquete.getPerfil() + " apos troca: " + formatar(tiquete.calcularValor()));

        tiquete.alterarPerfil(new conveniado());
        System.out.println("perfil " + tiquete.getPerfil() + " apos nova troca: " + formatar(tiquete.calcularValor()));
        System.out.println();

        ticket curto = new ticket("xyz9876", 20, new rotativo());
        System.out.println("tiquete " + curto.getPlaca() + " com " + curto.getMinutos() + " minutos");
        System.out.println("perfil " + curto.getPerfil() + ": " + formatar(curto.calcularValor()));

        curto.alterarPerfil(new conveniado());
        System.out.println("perfil " + curto.getPerfil() + " apos troca: " + formatar(curto.calcularValor()));
        System.out.println();

        ticket medio = new ticket("def4567", 45, new conveniado());
        System.out.println("tiquete " + medio.getPlaca() + " com " + medio.getMinutos() + " minutos");
        System.out.println("perfil " + medio.getPerfil() + ": " + formatar(medio.calcularValor()));
    }

    private static String formatar(double valor) {
        return String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", valor);
    }
}
