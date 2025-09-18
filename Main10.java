public class Main9 {
    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
            }
        }

        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < 2; i++) {
            System.out.println(C[i][0] + " " + C[i][1]);
        }
    }
}