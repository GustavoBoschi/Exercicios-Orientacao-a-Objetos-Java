package Banco;

public class ContaEspecial extends ContaCorrente{
    
    @Override
    public void sacar (double valor){
        if (super.getSaldo() >= valor*1.001){
            super.setSaldo(super.getSaldo() - valor*1.001);
        }
    }
    
}
