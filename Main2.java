import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        int[] vetor = {12, 45, 7, 89, 23, 56, 78, 90, 34, 67, 21, 3, 99, 5, 38};
        int maior = vetor[0], menor = vetor [0];
        
        for (int num : vetor) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
    System.out.println("Maior: " + maior);
System.out.println("Menor: " + menor);
    }
}
