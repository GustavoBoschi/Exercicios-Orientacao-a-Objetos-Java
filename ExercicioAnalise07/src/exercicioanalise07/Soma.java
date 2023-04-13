package exercicioanalise07;

public class Soma {
    
    int num, resposta = 0;
    
    public int calcularSomatorio(){
        for (int i = 1; i <= num; i++) {
            resposta += i;
        }
        return resposta;
    }
    
}
