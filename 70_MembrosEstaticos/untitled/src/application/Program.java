package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {



    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        //instanciar o scanner
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        //metodos estáticos com uma CONSTANTE ESTÁTICA
        //SÃO INDEPENDENTES DE QUALQUER OBJETO
        //
        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n ", c);
        System.out.printf("Volume: %.2f%n ", v);
        System.out.printf("PI: %.2f%n ", Calculator.PI);

    }

}
