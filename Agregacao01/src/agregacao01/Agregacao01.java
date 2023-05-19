package agregacao01;

public class Agregacao01 {

    public static void main(String[] args) {

        Luta luta = new Luta();
        Lutador lutador1 = new Lutador("Pedrão Alonso de Carvalho", "Brasileiro", 28, 0, 0, 0, 1.85, 73.3);
        Lutador lutador2 = new Lutador("Axel Ruschel", "Alemão", 30, 0, 0, 0, 1.91, 72.1);

        luta.marcarLuta(lutador1, lutador2);
        System.out.println("");
        luta.lutar();
        System.out.println("");
        lutador1.status();
        System.out.println("");
        lutador2.status();

    }

}
