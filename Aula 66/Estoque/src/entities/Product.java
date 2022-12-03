package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    //nao retorna nada, serve apeanas para alterar o valor do atributo quantity
    public void addProducts (int quantity){
        //devemos somar ao 'quantity' que foi recebido como argumento
        //para diferenciar do atributo (da classe) quantity, utilizamos 'this' para citar o quantity que esta como atributo da classe
        //soma o quantity que veio como argumento com o que veio na classe (this.)
        this.quantity += quantity;
    }

    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Product data: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity;
    }
}
