import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números vai ser digitado?");
        int n = entrada.nextInt();
        double[] vetor = new double[n];

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextDouble();
        }

        System.out.println("Valores do vetor.");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        entrada.close();
    }
}
