package applications;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //criar um vetor de produtos com n elementos
        Produto[] vect = new Produto[n];

        for (int i=0; i< vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //instanciar um novo produto
            //o vect na posição [i] vai apontar pra esse objeto
            vect [i] = new Produto(name, price);
        }

        double soma = 0.0;
        for (Produto produto : vect) {
            /*acessando o vetor na posição [i]
             * se coloca o .getPrice porque queremos acessar apenas o preço*/
            soma += produto.getPrice();
        }

        double media = soma / vect.length;

        System.out.println("Média de preços: "+ media);


    }
}
