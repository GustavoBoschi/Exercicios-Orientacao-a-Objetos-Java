package exercicioconstrutores01;

public class Aluno {

    private String nome;
    private int RA;

    public Aluno() {
    }

    public Aluno(int RA) {
        this.RA = RA;
    }

    public Aluno(String nome, int RA) {
        this.nome = nome;
        this.RA = RA;
    }
}
