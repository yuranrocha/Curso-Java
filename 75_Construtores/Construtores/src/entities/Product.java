package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(){}

    /*Construtor
    *public - nome da classe - (parametros)
    *executa no momento da instanciação do objeto
    *vai obrigar a fornecer o nome, preço e quantidade no momento da instanciação
    *para ser possível, precisa receber esses dados como parâmetros*/
    public Product(String name, double price, int quantity){
        /*this.name[atributo do objeto - 'public String name']
        * = name [parametro do metodo]*/
        //palavra this serve para diferenciar atributos de variáveis locais
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //criar um construtor com somente o nome e o preço, quantidade é ZERO
    //construtor sobrecaregado
    /*Sobrecarga é disponibilizar mais de um construtor sobre a mesma operação,
    * sendo a diferença a lista de parametros*/
    public Product(String name, double price){
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
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
