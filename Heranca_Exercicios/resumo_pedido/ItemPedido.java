public class ItemPedido {
    private int quantidade;
    private produtos.Produto produto;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public produtos.Produto getProduto() {
        return produto;
    }

    public void setProduto(produtos.Produto produto) {
        this.produto = produto;
    }

    public ItemPedido(produtos.Produto produto, int quantidade) {
        setProduto(produto);
        setQuantidade(quantidade);
    }
}