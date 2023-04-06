package exercicioanalise02;

public class ExercicioAnalise02 {

    public static void main(String[] args) {

        Celular objCell = new Celular();

        objCell.nome = "K387654";
        objCell.marca = "Motorola";
        objCell.gb = 8;

        objCell.print();
        
        System.out.println("");

        objCell.ligar();
        objCell.ligar();
        objCell.desligar();
        objCell.desligar();
    }

}
