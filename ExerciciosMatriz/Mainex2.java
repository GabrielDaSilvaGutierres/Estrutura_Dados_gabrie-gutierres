public class Mainex2 {
    public static void main(String[] args) {
        int[][] grafo = {
            {1, 1, 0}, // A → A, B
            {0, 0, 1}, // B → C
            {0, 0, 0}  // C → nenhum
        };

        // a) Matriz de adjacência
        System.out.println("Matriz de adjacência:");
        for (int[] linha : grafo) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        // b) Auto-laço
        System.out.println("Auto-laço em A: " + grafo[0][0]);

        // c) Verificar vizinhança
        System.out.println("A é vizinho de B? " + (grafo[0][1] == 1));
    }
}
