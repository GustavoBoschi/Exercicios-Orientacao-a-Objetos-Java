package agregacao01;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void apresentar() {
        System.out.print("APRESENTANDO!!!\nNome: " + getNome()
                + " \nNacionalidade: " + getNacionalidade()
                + "\nIdade: " + getIdade()
                + "\nAltura: " + getAltura()
                + "\nPeso: " + getPeso()
                + "\nCategoria: " + getCategoria()
                + "\nVitorias: " + getVitorias()
                + "\nDerrotas: " + getDerrotas()
                + "\nEmpates: " + getEmpates() + "\n");
    }
    
    public void ganharLuta(){
        setVitorias(+1);
    }
    public void perderLuta(){
        setDerrotas(+1);
    }
    public void empatarLuta(){
        setEmpates(+1);
    }
    public void status(){
        System.out.println("Nome: "+getNome());
    }
}
