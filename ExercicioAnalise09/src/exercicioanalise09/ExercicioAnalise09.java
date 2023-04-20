package exercicioanalise09;

public class ExercicioAnalise09 {

    public static void main(String[] args) {
        

        ContaCorrente cc = new ContaCorrente();
        
        cc.setNome("Gustavo");
        System.out.println("Nome: "+cc.getNome());
        System.out.println("Saldo: "+cc.getSaldo());
        cc.depositar(2000);
        System.out.println("Saldo: "+cc.getSaldo());
        cc.sacar(500);
        System.out.println("Saldo: "+cc.getSaldo());
        

    }
    
}
