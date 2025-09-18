import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
        scanner.close();
    }
}
