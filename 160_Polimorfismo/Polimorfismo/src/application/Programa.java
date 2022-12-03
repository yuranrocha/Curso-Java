package application;

import entities.Conta;
import entities.ContaPoupança;

public class Programa {
    public static void main(String[] args) {

        /*instanciando com a classe 'Account' */
        Conta x = new Conta (1020, "Yuran", 1000.0);

        /*instanciando com a classe 'SavingsAccount': essa atribuição é feita
        * em tempo de EXECUÇÃO (UPCASTING). O compilador não sabe qual é o tipo
        * especifíco da variável y; ele vai chamar o método adequado com base
        * no objeto que foi instanciado, e essa instânciação é feita em tempo
        * de execução por meio de um upcasting. */
        Conta y = new ContaPoupança(1023, "Clebson", 1000.0, 0.01);

        /*Assim, teremos objetos diferentes na memória; mas as variáveis
        * que apontaram para esses objetos são do mesmo tipo. */

        /*Quando chamarmos a operação de saque para x/y teremos comportamentos
        * diferentes*/
        x.saque(50.0);
        y.saque(50.0);

        /*Chamamos a mesma operação em variáveis do mesmo tipo ['Conta'],
         * mas elas tiveram comportamentos diferentes, CONFORME OS OBJETOS
         * PARA OS QUAIS ELAS APONTAM.*/

        /*O compilador não sabe para qual tipo especifico a chamada do método Saldo
         *está sendo feita (ele só sabe que são duas variáveis tipo ‘Conta’)*/
        System.out.println((x.getSaldo()));
        System.out.println(y.getSaldo());
    }
}
