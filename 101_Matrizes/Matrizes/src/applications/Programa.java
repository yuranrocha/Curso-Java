package applications;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //criar uma matriz
        /*numeros inteiros -- [][](arranjo bidimensional) nomeDaMatriz -- =
        * new int -- [n linhas][n colunas]*/
        int[][] mat = new int [n][n];
        //para percorrer as linhas
        for(int i=0;i<mat.length;i++){
            //para percorrer as colunas em cada linha
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for(int i=0;i<mat.length;i++){
            //imprimir o elemento sempre na mesma linha e na mesma coluna
            System.out.print(mat[i][i] + " ");
        }

        int count = 0;
        System.out.println("Negative numbers = " + count);
        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat.length;j++){
                //para contar os numeros negativos na matriz
                if (mat[i][j]<0){
                    count++;
                }
            }
        }

    }
}
