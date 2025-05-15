import java.util.Scanner;

public class ex2 {

    static int[][] A, B, C;
    static int N;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o tamanho da matriz ");
        N = scanner.nextInt();

        A = new int[N][N];
        B = new int[N][N];
        C = new int[N][N];

        System.out.println("Insira os elementos da matriz A ");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                A[i][j] = scanner.nextInt();

        System.out.println("Insira os elementos da matrix B ");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                B[i][j] = scanner.nextInt();

        Thread q1 = new Thread(new SomaQuadrante(0, N / 2, 0, N / 2));
        Thread q2 = new Thread(new SomaQuadrante(0, N / 2, N / 2, N));
        Thread q3 = new Thread(new SomaQuadrante(N / 2, N, 0, N / 2));
        Thread q4 = new Thread(new SomaQuadrante(N / 2, N, N / 2, N));

        q1.start();
        q2.start();
        q3.start();
        q4.start();

        q1.join();
        q2.join();
        q3.join();
        q4.join();

        System.out.println("Matriz C");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        scanner.close();
    }

    static class SomaQuadrante implements Runnable {
        int linhaIni, linhaFim, colIni, colFim;

        public SomaQuadrante(int li, int lf, int ci, int cf) {
            linhaIni = li;
            linhaFim = lf;
            colIni = ci;
            colFim = cf;
        }

        public void run() {
            for (int i = linhaIni; i < linhaFim; i++) {
                for (int j = colIni; j < colFim; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
        }
    }
}
