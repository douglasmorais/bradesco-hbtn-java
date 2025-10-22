import java.util.ArrayList;
import java.util.Objects;

public class GestaoAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(String nome, String idade) {
        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
    }

    public void excluirAluno(String nome) {
        alunos.removeIf(aluno -> Objects.equals(aluno.getNome(), nome));
    }

    public void buscarAluno(String nome) {
        for(int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getNome() == nome) {
                System.out.println(alunos.get(i).toString());
            }
        }
    }

    public void listarAlunos() {
        for(int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).toString());
        }
    }
}
