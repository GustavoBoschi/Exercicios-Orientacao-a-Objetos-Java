package exercicioanalise09;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private String nome;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        System.out.println("Deposito Efetuado");
        this.saldo = this.saldo + valor + valor * 0.1;

    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            System.out.println("Saque Efetuado");
            this.saldo = this.saldo - valor;
        }else {
            System.out.println("Saldo Insuficiente");
        }
    }
    
    
}
