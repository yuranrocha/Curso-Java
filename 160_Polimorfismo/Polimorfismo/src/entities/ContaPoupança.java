package entities;

public class ContaPoupança extends Conta {

    private Double taxaDeJuros;

    public ContaPoupança(Integer numeroConta, String titular, Double saldo, Double taxaDeJuros) {
        super(numeroConta, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    //Sobreposição - mudamos
    @Override
    public final void saque(double quantia){

        saldo -= quantia;
    }
}
