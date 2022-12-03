import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0;i<n;i++){
            //vect na posição [0] recebendo o que o usuário digitar
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0;i<n;i++){
            soma += vect[i];
        }

        double media = soma / n;

        System.out.println("Média de altura: "+media);
    }
}
