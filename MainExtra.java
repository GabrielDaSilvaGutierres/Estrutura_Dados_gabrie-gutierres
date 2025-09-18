public class MainExtra {
    public static void main(String[] args) {

int[] vetor = {9, 5, 2, 8, 1, 3, 7, 6, 4, 0};
 
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
 
        System.out.println("Vetor ordenado:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}