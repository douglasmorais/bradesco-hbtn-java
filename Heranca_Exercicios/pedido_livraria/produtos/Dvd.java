public class Dvd extends Produto {
    private String diretor;
    private String genero;
    private int duracao;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        setDiretor(diretor);
        setGenero(genero);
        setDuracao(duracao);
    }

    @Override
    public double obterPrecoLiquido() {
        return (1.2 * getPrecoBruto());
    }
}