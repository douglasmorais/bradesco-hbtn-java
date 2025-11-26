public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        boolean encontrado = false;
        System.out.printf("Procurando o nome: \"%s\"\n", nome);

        int left = 0;
        int right = nomes.length - 1;
        while(left <= right && !encontrado) {
            int mid = left + (right - left) / 2;
            System.out.printf("Passando pelo indice: %d\n", mid);
            if(nomes[mid].equals(nome)) {
                System.out.printf("Nome %s encontrado na posição %d\n", nome, mid);
                encontrado = true;
            }
            if(nomes[mid].substring(0, 1).compareTo(nome.substring(0, 1)) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if(!encontrado) {
            throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");
        }
    }
}
