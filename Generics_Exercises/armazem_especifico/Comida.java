public class Comida {
    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String comidaToString;
        comidaToString = "[" + nome + "] " + String.format("%.6f", calorias) + " R$ " + String.format("%.6f", preco);

        return comidaToString;
    }
}
