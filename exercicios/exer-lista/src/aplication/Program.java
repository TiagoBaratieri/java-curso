package aplication;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Entre com a quantidade de funcionarios: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Funcionario: " + i + ": ");
            System.out.println("Id: ");
            int id = entrada.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id ja existe tente novamente: ");
                id = entrada.nextInt();
            }

            System.out.println("Nome: ");
            entrada.nextLine();
            String nome = entrada.nextLine();
            System.out.println("Salário: ");
            double salario = entrada.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }

        System.out.println();

        System.out.println("Entre com o id do funcionario que recebera aumento: ");
        int id = entrada.nextInt();
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Id não existe");
        } else {
            System.out.println("Entre com a porcentagem: ");
            double porcentagem = entrada.nextDouble();
            emp.increaseSalary(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }


        entrada.close();

    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
