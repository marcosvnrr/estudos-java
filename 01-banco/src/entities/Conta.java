package entities;

public class Conta {
    private String titular;
    public int numeroConta;
    private double saldo;

    public Conta(int numeroConta, String titular) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public Conta(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= (valor + 5.00);
    }

    public void alterarTitular(String novoTitular){
        this.titular = novoTitular;
    }

    public String getTitular() {
        return titular;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public String toString(){
        return "Conta "
                + getNumeroConta()
                + "Titular: " + getTitular()
                + ", Saldo: R$ " + String.format("%.2f%n", getSaldo());

    }

}
