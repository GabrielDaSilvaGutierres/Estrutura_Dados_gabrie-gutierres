import java.util.Scanner;
import java.util.Arrays;
public class Main7 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};
        int[][] transporta = new int[2][3];
        Scanner scanner = new Scanner(System.in);
    for (int i =0; i < 3; i++){
        for (int j = 0; j < 2; j++) {
            transporta[j][i] = matriz[i][j];
        }
    }
    System.out.println("Transposta: ");
    for (int[] linha : transporta){
        System.out.println(Arrays.toString(linha));
    }
    }
}
