import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);


        int n = entrada.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Números negativos.");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }

        }

        entrada.close();
    }
}
