public class Mainex4 {
    public static void main(String[] args) {
        int[][] matriz = {
            {2, 4, 5},
            {0, 3, 6},
            {0, 0, 7}
        };

        // a) Diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        // b) Determinante (produto da diagonal)
        int det = 1;
        for (int i = 0; i < matriz.length; i++) {
            det *= matriz[i][i];
        }
        System.out.println("\nDeterminante: " + det);
    }
}
