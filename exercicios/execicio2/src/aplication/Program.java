package aplication;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada= new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Entre com o nome do funcionario: ");
        employee.name = entrada.nextLine();

        System.out.println("Entre com o salário bruto: ");
        employee.grossSalary = entrada.nextDouble();

        System.out.println("Entre com o imposto: ");
        employee.tax = entrada.nextDouble();

        System.out.println("Nome: " + employee.name);

        System.out.println("Salario bruto: " + employee.grossSalary);

        System.out.println("Imposto: " + employee.tax);

        System.out.println(employee);

        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = entrada.nextDouble();
        employee.increaseSalary(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + employee);

        entrada.close();

    }
}
