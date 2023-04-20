package exerciciosobrecarga01;

public class ExercicioSobrecarga01 {

    public static void main(String[] args) {

        CalcularMath cm = new CalcularMath();

        System.out.println(cm.somar(10, 20));
        System.out.println(cm.somar(2.5, 7.8));
        System.out.println(cm.somar(5.5f, 9.6f));
    }

}
