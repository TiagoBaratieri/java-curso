package aplication;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas?");
        int n = entrada.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        int somaMenor16 = 0;
        double somaAltura = 0.0;
        for (int i = 0; i < pessoas.length; i++) {
            entrada.nextLine();
            String nome = entrada.nextLine();
            int idade = entrada.nextInt();
            double altura = entrada.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
            somaAltura += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16) {
               somaMenor16++;
            }
            System.out.println("Dados da " + (i+1) + " pessoa: " + pessoas[i]);
        }

        double media = somaAltura / n;
        double porcentagem = (somaMenor16 / n) * 100;

        System.out.println();

        System.out.printf("Média de altura:%.2f\n", media);
        System.out.println("Porcentagem de idade menos de 16 anos: " + porcentagem);
        entrada.close();

    }
}
