package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        int m, n;

        System.out.println("Qual a contidade de linhas?");
        m = entrada.nextInt();
        System.out.println("Qual a contidade de colunas?");
        n = entrada.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println();

        System.out.println("Valores negativos: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0){
                    System.out.println(matriz[i][j]);
                }
            }
        }


        entrada.close();
    }
}
