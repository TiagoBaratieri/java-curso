package aplication;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Innforme o valor do dolar: ");
        double dollarPrice = entrada.nextDouble();

        System.out.print("Quantos dolares serão comprados? ");
        double amount = entrada.nextDouble();
        double result = CurrencyConverter.dolarToReal(amount, dollarPrice);
        System.out.printf("Valor a der pagos em reais = %.2f\n ", result);
        entrada.close();

    }
}
