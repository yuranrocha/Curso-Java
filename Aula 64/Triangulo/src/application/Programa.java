package application;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //criou as variáveis dos tipo 'x' e 'y'
        Triangulo x, y;

        //instanciando(criando) o objeto
        //uma unica variavel do tipo triangulo (e composta)
        //objetos devidamente instanciados em memória
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre as medidas do triangulo X: ");
        //acessar os atributos e armazenar dados
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //chamar a função atraves do metodo X
        double areaX = x.area();
        double areaY = y.area();


    }
}
