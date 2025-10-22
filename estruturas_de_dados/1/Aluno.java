public class Aluno {
    private String nome;
    private String idade;

    public String getNome() {
        return nome;
    }

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        String saida = nome + " " + idade;
        return saida;
    }
}
