public class Mainex1 {
    public static void main(String[] args) {
        double[][] matriz = { {3, 1}, {2, 4} };
        double[] b = {5, 6}; // exemplo de termos independentes

        // a) Sistema: 3x + y = 5 ; 2x + 4y = 6
        System.out.println("Sistema:");
        System.out.println("3x + y = 5");
        System.out.println("2x + 4y = 6");

        // b) Diagonal principal
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
