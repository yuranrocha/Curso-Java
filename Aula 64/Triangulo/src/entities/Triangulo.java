package entities;

public class Triangulo {

    //atributos a, b, c
    public double a;
    public double b;
    public double c;

    //metodo para calcular a area
    //double = tipo de retorno
    //area = nome da operação
    //( ) = parametros
    public double area(){
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
