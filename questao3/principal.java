package questao3;

import java.util.Locale;

public class principal {
    public static void main(String[] args) {
        System.out.println("----- questao 3: pedido de cafe -----");
        System.out.println();

        mostrar("pedido 1", new leite(new espresso()));
        mostrar("pedido 2", new chantilly(new calda(new cha())));
        mostrar("pedido 3", new chantilly(new leite(new leite(new espresso()))));
    }

    private static void mostrar(String nome, bebida pedido) {
        System.out.println(nome + ": " + pedido.descricao());
        System.out.println("total: " + String.format(Locale.forLanguageTag("pt-BR"), "R$ %.2f", pedido.preco()));
        System.out.println();
    }
}
