import java.util.Scanner;
import java.util.Arrays;
public class Main6 {
    public static void main(String[] args) {
        int[] vetor = {12, 7, 9, 4, 6, 11, 13, 8, 10, 3, 5, 2};
        int pares = 0, impares = 0;
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] soma = new int[2] [2];
        Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i < 2; i++) {
        for (int j  = 0; j < 2; j++) {
            soma[i][j] = A[i][j] + B[i][j];
        }
    }
    
    System.out.println("Soma das matrizes: ");
    for (int[] linha : soma) {
        System.out.println(Arrays.toString(linha));
    }
    }
}
