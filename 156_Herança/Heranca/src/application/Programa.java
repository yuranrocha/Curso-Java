package application;

import entities.Conta;
import entities.ContaNegocios;
import entities.ContaPoupança;

public class Programa {

    public static void main(String[] args) {

    Conta acc = new Conta(1001, "Yuran", 0.0);
    ContaNegocios bacc = new ContaNegocios(1002, "Clebson", 0.0, 500.0);

    //UPCASTING
    /*objeto da subclasse PODE ser atribuido a um objeto da superclasse:
    * uma contaEmpresarial também é uma conta*/
    Conta acc1=bacc;

    Conta acc2 = new ContaNegocios(1003, "Bob", 0.0, 200.0);

    Conta acc3 = new ContaPoupança(1004, "Ana", 0.0, 0.01);

    /*DOWNCASTING - converter um objeto da subclasse p/ superclasse
    *nao posso converter uma CONTA para um tipo CONTANEGOCIOS>Conversão não natural
    *para forçar a conversão, devo fazer um casting manual '(ContaNegocio')*/
    ContaNegocios acc4 = (ContaNegocios) acc2;
    acc4.emprestimo(100.0);
    ((ContaNegocios) acc2).emprestimo(20.0);

    /*no momento de fazer downcasting, nem sempre vai dar certo
    * para evitar esse tipo de erro, deve-se testar com 'instanceof'*/
    /*se o que tiver na variavel acc3 for um objeto que seja instancia de business
    * account, poderei fazer o casting. assim, poderei efetuar uma operação de
    * empréstimo a partir dele */
    if(acc3 instanceof ContaNegocios){
        ContaNegocios acc5 = (ContaNegocios) acc3;
        acc5.emprestimo(200.0);
        System.out.println("Empréstimo!");
    }

    if(acc3 instanceof ContaPoupança){
        ContaPoupança acc5 = (ContaPoupança) acc3;
        acc5.atualizarSaldo();
        System.out.println("Atualizado!");
    }

    System.out.println("--------------------");

    Conta acc10 = new Conta(1111, "Yu", 1000.0);
    acc1.saque((50.0));
    System.out.println(acc1.getSaldo());

    Conta acc12 = new ContaPoupança(10122, "Mo", 1500.0, 0.2);
    acc.saque(200.0);
    System.out.println(acc2.getSaldo());
    }
}
