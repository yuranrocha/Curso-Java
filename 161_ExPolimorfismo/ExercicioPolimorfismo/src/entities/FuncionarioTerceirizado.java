package entities;

public class FuncionarioTerceirizado extends Funcionario {

    private Double despesaAdicional;

    public FuncionarioTerceirizado(){
        super();
    }

    public FuncionarioTerceirizado(String name, Double horas, Double valorPorHora, Double despesaAdicional) {
        //superclasse Funcionário
        super(name, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    //regra de pagamento para o funcionarioTerceirizado é diferente, por isso
    // utilizaremos o @Override para sobrescrever*/
    public double pagamento(){
        /*retorna o pagamento normal[super.pagamento] + mudança do enunciado */
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
