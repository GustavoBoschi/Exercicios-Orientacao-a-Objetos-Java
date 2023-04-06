package exercicioanalise01;

public class ExercicioAnalise01 {

    public static void main(String[] args) {

        Lampada objLampada = new Lampada();

        objLampada.nome = "Lampada 2.0 Claridade Update";
        objLampada.marca = "Lampadas Brasil";
        objLampada.cor = "Branca";
        objLampada.intensidade = "Intensa";
        objLampada.valor = 34.90;

        System.out.println(objLampada.toString());
        
        System.out.println("");
        
        objLampada.ligar();
        objLampada.ligar();
        objLampada.desligar();
        objLampada.desligar();

    }

}
