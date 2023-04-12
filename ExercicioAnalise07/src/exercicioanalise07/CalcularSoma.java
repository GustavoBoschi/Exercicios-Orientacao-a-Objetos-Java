package exercicioanalise07;

import java.util.Scanner;

public class CalcularSoma {
    
    Scanner entrada = new Scanner (System.in);
    
    int n, resposta = 0;
    
    public void soma (){
        
        System.out.print("Digite um número: ");
        n = entrada.nextInt();
        
        for (int i = 1; i < n; i++) {
            resposta += i;
            
        }
        
        System.out.printf("A soma dos números é %d\n", resposta);
    }
    
}
