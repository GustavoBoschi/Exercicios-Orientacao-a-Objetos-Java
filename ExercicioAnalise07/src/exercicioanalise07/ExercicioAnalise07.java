package exercicioanalise07;

import java.util.Scanner;

public class ExercicioAnalise07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Soma somarAte = new Soma();

        System.out.print("Digite um n�mero inteiro: ");
        somarAte.num = entrada.nextInt();
        
        System.out.printf("A soma dos numeros � %d\n", somarAte.calcularSomatorio());
    }

}
