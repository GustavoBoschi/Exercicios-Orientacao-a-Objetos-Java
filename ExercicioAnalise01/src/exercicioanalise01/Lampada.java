package exercicioanalise01;

public class Lampada {

    String marca;
    String cor;
    String intensidade;
    String nome;
    double valor;

    boolean ligado = false;

    public void ligar() {

        if (!ligado) {
            System.out.println("A lampada foi acesa");
            ligado = true;
        }else {
            System.out.println("A lampada já está acesa");
        }

    }

    public void desligar() {
        
        if (ligado) {
            System.out.println("A lampada foi apagada");
            ligado = false;
        }else {
            System.out.println("A lampada já está apagada");
        }

    }

    public String toString() {
        return "Nome: " + nome + "\nMarca: " + marca + "\nCor: " + cor + "\nIntensidade: "
                + intensidade + "\nValor: R$" + valor;
    }

}
