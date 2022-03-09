package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a contidade de linhas da matriz? ");
        int m = entrada.nextInt();
        System.out.println("Qual a contidade de colunas da matriz? ");
        int n = entrada.nextInt();

        double somaLinha;

        double[][] matriz = new double[m][n];
        double[] vetor = new double[m];

        for (int i = 0; i < m; i++) {

            System.out.println("Digite os elementos da a" + (i+1) + ". linha");

            for (int j = 0; j < n; j++) {
                matriz[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < m; i++) {
            somaLinha = 0;

            for (int j = 0; j < n; j++) {
                somaLinha = somaLinha + matriz[i][j];
            }

            vetor[i] = somaLinha;
        }

        System.out.println("Vetor gerado:");

        for (int i = 0; i < m; i++) {
            System.out.printf("%.1f\n", vetor[i]);
        }

        entrada.close();
    }
}
