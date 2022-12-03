package entities;

public class Conta {

    private Integer numeroConta;
    private String titular;
    protected Double saldo;

    private Conta(){
    }

    public Conta(Integer numeroConta, String titular, Double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //nao tem setSaldo porque nao posso mudar o saldo da conta livremente
    public Double getSaldo() {
        return saldo;
    }

    public void saque (double quantia){
        saldo -= quantia + 5.0;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }


}
