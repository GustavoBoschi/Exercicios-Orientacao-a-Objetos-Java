package agregacao01;

public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.peso = peso;

        if (peso > 52.1 && peso < 52.6) {
            this.categoria = "Peso-Palha";
        } else if (peso > 52.7 && peso < 56.7) {
            this.categoria = "Peso-Mosca";
        } else if (peso > 56.8 && peso < 61.2) {
            this.categoria = "Peso-Galo";
        } else if (peso > 61.3 && peso < 65.7) {
            this.categoria = "Peso-Pena";
        } else if (peso > 65.8 && peso < 70.3) {
            this.categoria = "Peso-Leve";
        } else if (peso > 70.4 && peso < 77.1) {
            this.categoria = "Peso Meio-Médio";
        } else if (peso > 77.2 && peso < 83.9) {
            this.categoria = "Peso-Médio";
        } else if (peso > 84.0 && peso < 92.9) {
            this.categoria = "Peso Meio-Pesado";
        } else if (peso > 93.0 && peso < 120.2) {
            this.categoria = "Peso-Pesado";
        } else {
            this.categoria = "Sem Categoria";
        }

    }

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
        System.out.print("" + nome
                + " \nNacionalidade: " + nacionalidade
                + "\nIdade: " + idade
                + "\nAltura: " + altura
                + "\nPeso: " + peso
                + "\nCategoria: " + categoria
                + "\nVitorias: " + vitorias
                + "\nDerrotas: " + derrotas
                + "\nEmpates: " + empates + "\n");
    }

    public void ganharLuta() {
        vitorias++;
    }

    public void perderLuta() {
        derrotas++;
    }

    public void empatarLuta() {
        empates++;
    }

    public void status() {
        System.out.println("Nome: " + nome
                + "\nVitorias: " + vitorias
                + "\nDerrotas: " + derrotas
                + "\nEmpates: " + empates);

    }

    
}