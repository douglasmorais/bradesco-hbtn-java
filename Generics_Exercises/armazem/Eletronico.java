public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String toString(Eletronico eletronico) {
        String eletronicoToString;
        eletronicoToString = "[" + descricao + "] R$ " + valor;

        return eletronicoToString;
    }
}
