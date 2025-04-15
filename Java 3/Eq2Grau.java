import java.util.Scanner;

class ErroRaizes extends Exception {
    public ErroRaizes(String msg) {
        super(msg);
    }
}

public class Eq2Grau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("a: ");
            double a = sc.nextDouble();
            System.out.print("b: ");
            double b = sc.nextDouble();
            System.out.print("c: ");
            double c = sc.nextDouble();

            double d = b * b - 4 * a * c;

            if (d < 0) {
                throw new ErroRaizes("Sem raízes reais.");
            } else if (d == 0) {
                throw new ErroRaizes("Raiz única.");
            } else {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Raízes: " + r1 + " e " + r2);
            }
        } catch (ErroRaizes e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
