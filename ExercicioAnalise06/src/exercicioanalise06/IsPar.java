
package exercicioanalise06;

import java.util.Scanner;

public class IsPar {
    
    Scanner entrada = new Scanner (System.in);  
    int num;
    boolean par = false;
    
    public void parImpar(){
        
        System.out.print("Informe um n�mero: ");
        num = entrada.nextInt();
        
        if (num % 2 == 0){
            par = true;
            System.out.println("Seu numero � par, logo "+par);
            
            
        } else {
             System.out.println("Seu numero � impar, logo "+par);
        }
        
    }
}
