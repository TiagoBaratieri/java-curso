package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Progam {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.println("Enter Product data: ");

        System.out.print("Name : ");
        String name = entrada.nextLine();

        System.out.print("Price: ");
        double price = entrada.nextDouble();

        Product product = new Product(name,price);

        System.out.println("Product data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock");
        quantity = entrada.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        entrada.close();


    }
}
