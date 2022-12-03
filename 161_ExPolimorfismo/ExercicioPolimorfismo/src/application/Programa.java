package application;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //ler a quantidade n de funcionários e armazenar numa lista
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int n = sc.nextInt();

        //for para ler repetidamente a quantidade de 'n' funcionários
        for (int i=1;i<=n;i++){
            System.out.println("Dados do funcionário #"+i+":");
            System.out.println("O funcionário é terceirizado (s/n)?");
            char ch = sc.next().charAt(0);
            System.out.println("Nome: ");
            //obrigatório para consumir a quebra de linha
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            double horas = sc.nextDouble();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            //caso o funcionário seja terceirizado
            if(ch == 's'){
                System.out.println("Despesa Adicional: ");
                double despesaAdicional = sc.nextDouble();
                Funcionario func = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesaAdicional);
                list.add(func);
            }else{
                Funcionario func = new Funcionario(nome, horas, valorPorHora);
                list.add(func);
            }

            System.out.println();
            System.out.println("PAGAMENTOS: ");
            //percorrer a lista, imprimindo o nome e pagamento de cada um
            for (Funcionario func : list){
                System.out.println(func.getNome() + "- R$" + String.format("%.2f",func.pagamento()));
            }

        }



    }
}
