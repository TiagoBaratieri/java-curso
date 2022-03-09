package aplicacao;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        Triangulo X, Y;
        X = new Triangulo();
        Y = new Triangulo();

        System.out.println("Entre com as medidas do triângulo X: ");
        X.A = entrada.nextDouble();
        X.B= entrada.nextDouble();
        X.C = entrada.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        Y.A = entrada.nextDouble();
        Y.B = entrada.nextDouble();
        Y.C = entrada.nextDouble();

        double areaX = X.area();
        double areaY = Y.area();

        System.out.printf("Area do triângulo x:%.4f%n", areaX);

        System.out.printf("Area do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X" );
        } else {
            System.out.println("Maior area: Y");
        }

        entrada.close();
    }
}
