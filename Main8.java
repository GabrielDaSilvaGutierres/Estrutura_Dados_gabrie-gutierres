import java.util.Scanner;
import java.util.Arrays;
public class Main8 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int soma = 0;
        Scanner scanner = new Scanner(System.in);
    for (int[] linha : matriz) {
        for (int num : linha) {
            soma += num;
        }
    }
    System.out.println("Soma dos elementos: " + soma);
    }
}
