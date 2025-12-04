public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        String eletronicoToString;
        eletronicoToString = "[" + descricao + "] R$ " + String.format("%.6f", valor);

        return eletronicoToString;
    }
}
