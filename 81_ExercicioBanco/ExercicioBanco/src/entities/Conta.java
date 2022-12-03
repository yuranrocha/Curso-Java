package entities;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    //numero da conta não pode ser alterado, então só usamos o método GET
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //só usamos o GET, porque o saldo da conta só pode ser alterado por meio de saque
    // e depósito*/
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        saldo -= quantia + 5.0;
    }

    @Override
    public String toString() {
        return "Conta" +
                numero +
                ", Titular: " + titular +
                ", Saldo= R$" + saldo;

    }
}
