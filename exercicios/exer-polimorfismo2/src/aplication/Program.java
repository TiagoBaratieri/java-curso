package aplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number od products: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or importd (s/u/i)?");
            char op = entrada.next().charAt(0);
            entrada.nextLine();
            System.out.println("Name: ");
            String name = entrada.nextLine();
            System.out.print("Price: ");
            double price = entrada.nextDouble();
            if (op == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufacture = sdf.parse(entrada.next());
                list.add(new UsedProduct(name, price, manufacture));
            } else if (op == 'i') {
                System.out.print("Custom fee: ");
                double customFee = entrada.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else {
                list.add(new Product(name, price));
            }

            System.out.println();
            System.out.println("PRICE TAGS:");
            for (Product p : list){
                System.out.println(p.priceTag());
            }
        }

        entrada.close();

    }
}
