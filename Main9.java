import java.util.Scanner;
import java.util.Arrays;
public class Main9 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
    }
}
