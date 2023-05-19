package agregacao01;

import java.util.Random;

public class Luta {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2) {

        if (lutador1.getCategoria().equals(lutador2.getCategoria())) {
            if (lutador1.getNome() == lutador2.getNome()
                    && lutador1.getNacionalidade() == lutador2.getNacionalidade()
                    && lutador1.getIdade() == lutador2.getIdade()
                    && lutador1.getAltura() == lutador2.getAltura()
                    && lutador1.getPeso() == lutador2.getPeso()) {
                System.out.println("Os dados são inválidos: Mesmos lutadores");
                aprovada = false;
            } else {
                System.out.println("Luta Marcada!!!");
                desafiante = lutador1;
                desafiado = lutador2;
                aprovada = true;
            }
        } else {
            System.out.println("Os dados são inválidos: Os lutadores não são da mesma categoria");
            aprovada = false;
        }

    }

    public void lutar() {
        if (aprovada = true) {
            System.out.println("O DESAFIANTE DA NOITE É\n");
            desafiante.apresentar();
            System.out.println("");
            System.out.println("E O DESAFIADO DA NOITE É\n");
            desafiado.apresentar();
            System.out.println("");

            Random random = new Random();
            int resultadoLuta = random.nextInt(3);

            if (resultadoLuta == 0) {
                desafiante.empatarLuta();
                desafiado.empatarLuta();

                System.out.println("A luta EMPATOU!!!");
            } else if (resultadoLuta == 1) {
                desafiante.ganharLuta();
                desafiado.perderLuta();

                System.out.println("O desafiante " + desafiante.getNome() + " VENCE "
                        + "o desafiado " + desafiado.getNome() + "!!!!!");
            } else {
                desafiante.perderLuta();
                desafiado.ganharLuta();

                System.out.println("O desafiante " + desafiante.getNome() + " PERDE para "
                        + "o desafiado " + desafiado.getNome() + "!!!!!");
            }

        } else if (aprovada = false) {
            System.out.println("Essa luta não pode acontecer!!");
        }
    }
}
