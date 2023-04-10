
package exercicioanalise06;

import java.util.Scanner;

public class IsPar {
    
    Scanner entrada = new Scanner (System.in);  
    int num;
    boolean par = false;
    
    public void parImpar(){
        
        System.out.print("Informe um número: ");
        num = entrada.nextInt();
        
        if (num % 2 == 0){
            par = true;
            System.out.println("Seu numero é par, logo "+par);
            
            
        } else {
             System.out.println("Seu numero é impar, logo "+par);
        }
        
    }
}
