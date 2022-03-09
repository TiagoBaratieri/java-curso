package aplication;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee: #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)?");
            char op = entrada.next().charAt(0);
            System.out.print("Name: ");
            String name = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Hours: ");
            int hours = entrada.nextInt();
            System.out.print("Value per hour: ");
            double valueperHour = entrada.nextDouble();
            if (op == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = entrada.nextDouble();
                list.add( new OutsourcedEmployee(name, hours, valueperHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valueperHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }


        entrada.close();

    }
}
