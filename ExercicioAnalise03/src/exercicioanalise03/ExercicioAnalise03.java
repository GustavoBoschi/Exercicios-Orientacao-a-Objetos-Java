package exercicioanalise03;

import java.util.Scanner;

public class ExercicioAnalise03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
       
        int n;
        
        System.out.print("Digite um numero: ");
        n = entrada.nextInt();
        
        //sequencia(n); aqui é para exibir o que foi feito ali dps
        
        Metodos.sequencia(n);
    }
    
    //static void sequencia(int n){
       // for (int i = 1; i <= n; i++) {
         //   System.out.printf("%d, ",i);
       // }
        
   // }
    
    //Fora do Void principal, para não precisar criar uma nova classe
    
}
