package aplication;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Entre com a largura do retângulo: ");
        rectangle.width = entrada.nextDouble();

        System.out.println("Entre coma a altura do retâmgulo: ");
        rectangle.height = entrada.nextDouble();

        System.out.printf("Area:%.2f\n", rectangle.area());
        System.out.printf("Perimetro:%.2f\n", rectangle.perimeter());
        System.out.printf("Diagonal:%.2f", rectangle.diagonal());

        entrada.close();

    }
}
