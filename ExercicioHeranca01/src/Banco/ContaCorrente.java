package Banco;

import javax.swing.JOptionPane;

public class ContaCorrente {
    
    private double saldo;
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double valor){
        this.saldo = valor;
    }
    
    public void depositar (double valor){
        this.saldo = saldo + valor;
    }
    
    public void sacar (double valor){
        if (this.saldo >= valor*1.005){
            this.saldo = this.saldo - valor*1.005;
        }else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        }
    }
}
