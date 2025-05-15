import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        while (true) {
            try {
                System.out.println("Numero");
                numero = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Numero invalido");
            }
        }
    }
}
