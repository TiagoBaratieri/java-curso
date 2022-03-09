package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a ordem da matriz? ");
        int n = entrada.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }

        System.out.println();

        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }

        System.out.println("Quantidade de negativos: " + cont);

        entrada.close();
    }
}
