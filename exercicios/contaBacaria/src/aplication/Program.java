package aplication;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Conta conta;

        System.out.println("Entre com o número da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Entre com o nome do titular: ");
        String nome = entrada.nextLine();

        System.out.println("Deseja depositar um valor inicial? (S/N)");
        char op = entrada.next().charAt(0);
        if (op == 'S') {
            System.out.println("Entre com valor de depósito: ");
            double saldoInicial = entrada.nextDouble();

            conta = new Conta(numero, nome, saldoInicial);

            System.out.print("Depósito realizado com sucesso!\n");
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println("-=-=-=-Conta cadastrada -=-=-=- ");
        System.out.println();
        System.out.println(conta);
        System.out.println();
        System.out.println("Entre com apção desejada: ");
        System.out.println("1-Depositar: ");
        System.out.println("2-Sacar: ");
        int n = entrada.nextInt();
        switch (n) {
            case 1:
                System.out.println("Informe o valor: ");
                double valor = entrada.nextDouble();
                conta.depositar(valor);
                System.out.printf("Saldo atualizado.\n " );
                System.out.println(conta);
                break;

            case 2:
                System.out.println("Informe o valor a sacar:");
                valor = entrada.nextDouble();
                if (valor > conta.sacar(valor)) {
                    System.out.printf("Saldo insuficiente!\n");
                    System.out.println(conta);
                } else {
                    System.out.println("Valor sacado com sucesso!\n");
                    System.out.printf("Valor atualizado.\n");
                    System.out.println(conta);
                }
        }

    }

}

