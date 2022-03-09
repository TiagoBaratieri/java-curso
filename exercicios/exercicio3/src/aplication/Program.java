package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Entre com o nome do estudante: ");
        student.name = entrada.nextLine();

        System.out.println("Entre com a primeira nota: ");
        student.grade1 = entrada.nextDouble();

        System.out.println("Entre com a segunda nota: ");
        student.grade2 = entrada.nextDouble();

        System.out.println("Entre com a terceira nota: ");
        student.grade3 = entrada.nextDouble();

        System.out.println("Nome do aluno: " + student.name);

        System.out.printf("Nota final:%.2f\n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("Aluno Reprovado!!!");
            System.out.printf("Faltaram%.2f pontos\n ", student.missingPoints());
        } else {
            System.out.println("Aluno aprovado!!!");
        }
        entrada.close();

    }
}
