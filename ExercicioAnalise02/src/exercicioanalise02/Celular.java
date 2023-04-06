package exercicioanalise02;

public class Celular {

    String nome;
    String marca;
    int gb;

    boolean ligado = false;

    public void print() {

        System.out.printf("Nome: %s"
                + "\nMarca: %s"
                + "\nGB: %d\n", nome, marca, gb);

    }

    public void ligar() {

        if (!ligado) {
            System.out.println("O celular está sendo ligado, Bem vindo!");
            ligado = true;
        } else {
            System.out.println("O celular já está ligado");
        }

    }
    
    public void desligar() {
        
        if (ligado) {
            System.out.println("O celular está sendo desligado, Adeus");
            ligado = false;
        }else {
            System.out.println("O celular já está desligado");
        }

    }

}
