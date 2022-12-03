package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //instanciação
        Conta conta;

        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Digite o nome do titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Existe um depósito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);
        if(resposta == 's'){
            System.out.println("Entre o valor inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }else{
            conta = new Conta(numero, titular);
        }

        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println("Entre um valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println("Entre um valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);


    }
}
