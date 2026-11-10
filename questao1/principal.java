package questao1;

public class principal {
    public static void main(String[] args) {
        System.out.println("----- questao 1: monitor de estoque -----");
        System.out.println();

        produto cafe = new produto("cafe", 10);
        compras areaCompras = new compras();
        vendas areaVendas = new vendas();
        auditoria areaAuditoria = new auditoria();
        cafe.adicionarObservador(areaCompras);
        cafe.adicionarObservador(areaVendas);
        cafe.adicionarObservador(areaAuditoria);

        System.out.println("produto cafe com estoque inicial de " + cafe.getQuantidade() + " unidades");
        System.out.println("areas interessadas: compras, vendas, auditoria");
        System.out.println();

        alterar(cafe, 8);
        alterar(cafe, 3);
        alterar(cafe, 3);
        alterar(cafe, 0);
        alterar(cafe, 7);

        System.out.println("removendo a area de vendas");
        cafe.removerObservador(areaVendas);
        System.out.println();

        alterar(cafe, 0);
        alterar(cafe, 6);

        System.out.println("areas restantes: compras, auditoria");
    }

    private static void alterar(produto produto, int novaQuantidade) {
        int quantidadeAnterior = produto.getQuantidade();
        System.out.println("alterando estoque de " + quantidadeAnterior + " para " + novaQuantidade);
        produto.alterarQuantidade(novaQuantidade);
        if (quantidadeAnterior == novaQuantidade) {
            System.out.println("quantidade nao mudou, nenhuma area foi notificada");
        }
        System.out.println();
    }
}
