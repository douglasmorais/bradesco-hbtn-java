public class Comida {
    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String toString(Comida comida) {
        String comidaToString;
        comidaToString = "[" + nome + "] " + calorias + " R$ " + preco;

        return comidaToString;
    }
}
