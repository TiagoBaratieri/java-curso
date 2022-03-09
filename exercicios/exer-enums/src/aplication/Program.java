package aplication;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Client data:\n");
        System.out.println("Name:");
        String name = entrada.nextLine();
        System.out.println("Email:");
        String email = entrada.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(entrada.next());

        Client client = new Client(name, email, birthDate);

        System.out.print("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(entrada.next());
        Order order = new Order(new Date(), status, client);
        System.out.println("How many items to this order? ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.println("Product name: ");
            entrada.nextLine();
            String productName = entrada.nextLine();
            System.out.println("Product price: ");
            Double productPrice = entrada.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.println("Quantity: ");
            Integer quantity = entrada.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);


        entrada.close();


    }
}
