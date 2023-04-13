package exercicioanalise08;

import java.util.Scanner;

public class Aluno {

    Scanner entrada = new Scanner(System.in);

    String nome;
    String ra;
    double media, nota1, nota2;

    public void estudante() {

        System.out.print("Digite o nome do Aluno: ");
        nome = entrada.nextLine();

        System.out.print("Digite o RA do Aluno: ");
        ra = entrada.nextLine();

        System.out.print("Digite a N1 do Aluno: ");
        nota1 = entrada.nextDouble();

        System.out.print("Digite a N2 do Aluno: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Nome: %s\nRA: %s\nN1: %.2f\nN2: %.2f\nMédia: %.2f\n"
                + "", nome, ra, nota1, nota2, media);

    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void printf() {
        System.out.printf("Nome: %s\nRA: %s\nN1: %.2f\nN2: %.2f\n"
                + "", nome, ra, nota1, nota2);
    }

}
