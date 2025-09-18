import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};
        double soma = 0;

        Scanner scanner = new Scanner(System.in);
    
    for (double nota : notas) {
        soma += nota;
    }
    
    double media = soma / notas.length;
    System.out.println("Média: " + media);
    
        scanner.close();
    }
}
