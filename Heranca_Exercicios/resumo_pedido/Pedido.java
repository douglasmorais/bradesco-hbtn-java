package resumo_pedido;

import javax.sound.midi.SysexMessage;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public double calcularTotal() {
        double total = 0;
        double liquido = 0;

        int tamanhoPedido = itens.length;

        for(int i = 0; i < tamanhoPedido; i++) {
            liquido = (itens[i].getQuantidade()) * itens[i].getProduto().obterPrecoLiquido();
            total += liquido;
        }
        total = (1 - (getPercentualDesconto()/100)) * total ;

        return total;
    }

    public void apresentarResumoPedido() {
        int tamanhoPedido = itens.length;

        System.out.printf("------- RESUMO PEDIDO -------\n");
        for(int i = 0; i < tamanhoPedido; i++) {
            System.out.printf("Tipo: " + itens[i].getProduto().getClass().getSimpleName() + "  Titulo: " + itens[i].getProduto().getTitulo() + "  Preco: %.2f", itens[i].getProduto().obterPrecoLiquido());
            System.out.printf("  Quant: " + itens[i].getQuantidade() + "  Total: %.2f", itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade());
            System.out.printf("\n");
        }
        System.out.printf("----------------------------\n");
        System.out.printf("DESCONTO: %.2f\n", (calcularTotal()/(1 - (getPercentualDesconto()/100))) - calcularTotal());
        System.out.printf("TOTAL PRODUTOS: %.2f\n", calcularTotal()/(1 - (getPercentualDesconto()/100)));
        System.out.printf("----------------------------\n");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.printf("----------------------------\n");
    }
}