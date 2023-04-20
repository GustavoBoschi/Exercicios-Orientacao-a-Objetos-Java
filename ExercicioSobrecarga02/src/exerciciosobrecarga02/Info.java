package exerciciosobrecarga02;

public class Info {

    public String dizerInformacao(String nome) {
        return "Meu nome é: " + nome;
    }

    public String dizerInformacao(int idade) {
        return "Minha idade é: " + idade;
    }

    public String dizerInformacao(double peso, double altura) {
        return "Meu peso é: " + peso + "\nMinha altura é: " + altura;
    }

}
