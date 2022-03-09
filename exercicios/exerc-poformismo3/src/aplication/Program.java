package aplication;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payer: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Indidual or company (i/c)?");
            char op = entrada.next().charAt(0);
            entrada.nextLine();
            System.out.print("Name: ");
            String name = entrada.nextLine();
            System.out.print("Anual income: ");
            double anulaIncome = entrada.nextDouble();
            if (op == 'i') {
                System.out.print("Health expenditures: ");
                double healtthExpenditures = entrada.nextDouble();
                list.add(new Individual(name, anulaIncome, healtthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int employees = entrada.nextInt();
                list.add(new Company(name,anulaIncome,employees));
            }
        }

        System.out.println();
        double sum = 0.0;
        System.out.print("TAXES PAID:");
        System.out.println();

        for (TaxPayer t : list){
            double tax = t.tax();
            System.out.println(t.getName() + " $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("Total taxes: $ " + String.format("%.2f", sum));

        entrada.close();


    }
}
