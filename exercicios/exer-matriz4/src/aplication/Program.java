package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz?");
        int n = entrada.nextInt();

        int[][] matriz = new int[n][n];
        int[] maiorLinha = new int[n];
        int maior;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            maior = matriz[i][0];
            for (int j = 0; j < n; j++) {
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                }
            }
            maiorLinha[i] = maior;
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", maiorLinha[i]);
        }

        entrada.close();
    }
}
