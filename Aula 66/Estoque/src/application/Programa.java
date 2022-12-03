package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //declarar uma variavel do tipo product
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");

        //para armazenar o nome dentro do objeto product
        //guardo dentro da variável product, no campo name
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //para converter o objeto em String
        System.out.println(product);

        System.out.println("Enter the number of products to be added in stock: ");
        /*o valor que o usuário digitar será passado como parametro no metodo
        'addProducts' para que seja feita a entrada no estoque e a aCtualização
        da quantidade do produto*/
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);




    }
}
