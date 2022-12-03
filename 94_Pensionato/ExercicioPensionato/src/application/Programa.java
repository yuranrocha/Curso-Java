package application;

import entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //criar os vetores
        Aluguel[] vect = new Aluguel[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println();
            System.out.println("Aluguel: #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int numeroQuarto = sc.nextInt();

            //instanciar o objeto para a posiçao digitada
            vect[numeroQuarto] = new Aluguel (name, email);
    }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        //percorrer o vetor de 0 a 9 para ver os quartos ocupados
        for (int i=0;i<10;i++){
            if(vect[i] != null){
                System.out.println(i+": "+vect[i]);
            }
            }
        }
}
