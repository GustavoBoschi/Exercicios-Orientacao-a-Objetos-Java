package exercicioanalise05;

import java.util.Scanner;

public class EncontrarMax {

    Scanner entrada = new Scanner(System.in);

    int num[] = new int[2];
    int maior;

    public void maximo() {

        for (int i = 0; i < 2; i++) {
            System.out.printf("Informe o %d número: ", i+1);
            num[i] = entrada.nextInt();
        }

        maior = num[0];

        for (int i = 1; i < 2; i++) {
            if (maior > num[i]) {
                System.out.printf("O maior numero digitado foi %d\n", maior);
                break;
            } else {
                maior = num[i];
                System.out.printf("O maior numero digitado foi %d\n", maior);
                break;
            }
        }

    }

}
