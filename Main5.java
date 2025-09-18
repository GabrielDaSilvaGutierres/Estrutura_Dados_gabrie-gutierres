import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        int[] vetor = {12, 7, 9, 4, 6, 11, 13, 8, 10, 3, 5, 2};
        int pares = 0, impares = 0;

        Scanner scanner = new Scanner(System.in);
    
    for (int num : vetor) {
        if (num % 2 == 0) pares++;
        else impares++;
    }
    System.out.println("Pares: " + pares);
    System.out.println("Impares: " + impares);
        scanner.close();
    }
}
