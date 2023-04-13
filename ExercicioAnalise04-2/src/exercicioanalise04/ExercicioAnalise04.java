package exercicioanalise04;

import java.util.Scanner;

public class ExercicioAnalise04 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        ExibirMes objmes = new ExibirMes();
        
        System.out.print("Informe um número: ");
        objmes.numMes = entrada.nextInt();
        
        objmes.qualMes();
    }
    
}
