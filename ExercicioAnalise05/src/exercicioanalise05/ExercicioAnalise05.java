package exercicioanalise05;

import java.util.Scanner;

public class ExercicioAnalise05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        EncontrarMax objmax = new EncontrarMax();

        System.out.print("Digite o primeiro número: ");
        objmax.num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        objmax.num2 = entrada.nextInt();

        if (objmax.maximo() > objmax.num2) {
            System.out.printf("O maior número é: %d\n", objmax.maximo());
        } else {
            System.out.printf("O maior número é: %d\n", objmax.num2);
        }

    }
}
