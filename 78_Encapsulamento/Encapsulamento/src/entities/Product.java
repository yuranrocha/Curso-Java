package entities;

public class Product {
    /*'private' afirma que esses atributos não podem ser acessados por outras classes */
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    /*método responsável para ACESSAR o atributo private 'name'*/
    public String getName() {
        return name;
    }

    /*método responsável para ALTERAR o atributo private 'name'*/
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //cria-se apenas o get, porque o set poderia gerar inconsistência no programa
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product" +
                " name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity
                ;
    }
}