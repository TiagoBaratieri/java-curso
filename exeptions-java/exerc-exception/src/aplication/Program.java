package aplication;

import model.entities.Account;
import model.entities.exception.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Holder: ");
        String name = entrada.nextLine();
        System.out.print("Initial balance: ");
        double balance = entrada.nextDouble();

        Account account = new Account(number, name, balance);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double withdraw = entrada.nextDouble();

        try{
            account.withdraw(withdraw);
            System.out.printf("New balance:%.2f\n",account.getBalance());
        }
        catch (AccountException e){
            System.out.println(e.getMessage());
        }



        entrada.close();
    }
}
