package exercicioanalise08;

import java.util.Scanner;

public class ExercicioAnalise08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        //aluno.estudante();

        System.out.print("Digite o nome do Aluno: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Digite o RA do Aluno: ");
        aluno.ra = entrada.nextLine();

        System.out.print("Digite a N1 do Aluno: ");
        aluno.nota1 = entrada.nextDouble();

        System.out.print("Digite a N2 do Aluno: ");
        aluno.nota2 = entrada.nextDouble();
        
        aluno.printf();
        System.out.println("Média: "+ aluno.calcularMedia());
    }

}
