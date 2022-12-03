package application;

import model.entities.CarRental;
import model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //para ler a data e hora, precisamos criar um objeto de formatação
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //LER OS DADOS DO USUARIO
        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        //ler a data de retirada
        //recebe o .parse pq vai parsear o dado que eu digitar com o formato 'fmt'
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        //INSTANCIAR O OBJETO DO CARRENTAL
        CarRental cr = new CarRental(start, finish, new Vehicle((carModel)));

        //ASSOCIAR O 'INVOICE(FATURA)' AO 'CARRENTAL(ALUGUEL DO CARRO)'


    }
}
