package entities;

public class ContaNegocios extends Conta {

    private Double limiteEmprestimo;

    public ContaNegocios(Integer numeroConta, String titular, Double saldo, Double limiteEmprestimo) {
        //chamar o construtor da superclasse - Conta
        super(numeroConta, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantia){
        if(quantia <= limiteEmprestimo) {
            //podemos utilizar o saldo porque subsitutímos
            saldo+=quantia-10.0;
        }
    }

    /*na classe ContaNegocios, a regra para o saque é a mesma para realizar o
    * saque normalmente da superclasse, contudo queremos descontar mais 2.0 >
    * utilizamos a palavra 'super'*/
    @Override
    public void saque(double quantia){
        //realiza o saque normal com a regra da superclasse
        super.saque(quantia);
        //acrescenta um desconto adicional
        saldo -= 2.0;
    }
}
