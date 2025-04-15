import java.util.Scanner;
import java.util.InputMismatchException;

public class Vetor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int i = 0;

        while (i < 10) {
            try {
                System.out.print("Digite (0 para parar): ");
                int n = sc.nextInt();

                if (n == 0) {
                    v[i] = n;
                    break;
                }

                v[i] = n;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor inválido.");
                sc.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Vetor cheio!");
                break;
            }
        }

        System.out.println("\nVetor:");
        for (int j = 0; j < v.length; j++) {
            System.out.println("Posição " + j + ": " + v[j]);
        }
    }
}
