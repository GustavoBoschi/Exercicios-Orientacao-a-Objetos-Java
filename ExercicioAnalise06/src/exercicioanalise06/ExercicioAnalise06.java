package exercicioanalise06;

import java.util.Scanner;

public class ExercicioAnalise06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        IsPar isPar = new IsPar();

        System.out.print("Digite um n�mero: ");
        isPar.num = entrada.nextInt();

        System.out.printf("Seu n�mero � %d, portanto %b\n", isPar.num, isPar.par());

    }

}
