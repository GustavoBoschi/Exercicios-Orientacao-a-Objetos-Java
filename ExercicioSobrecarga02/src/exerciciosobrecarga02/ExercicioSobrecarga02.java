package exerciciosobrecarga02;

import java.util.Scanner;

public class ExercicioSobrecarga02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Info objInfo = new Info();

        System.out.print("Digite seu nome: ");
        String nome = entrada.next();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("");
        System.out.println(objInfo.dizerInformacao(nome));
        System.out.println(objInfo.dizerInformacao(idade));
        System.out.println(objInfo.dizerInformacao(peso, altura));

    }

}
