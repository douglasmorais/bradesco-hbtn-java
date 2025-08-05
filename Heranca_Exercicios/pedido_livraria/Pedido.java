package pedido_livraria;

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
            liquido = liquido - getPercentualDesconto();
            total += liquido;
        }

        return total;
    }
}