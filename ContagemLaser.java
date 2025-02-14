import java.util.Scanner;

public class ContagemLaser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Lê altura e comprimento
            int A = scanner.nextInt();
            int C = scanner.nextInt();
            if (A == 0 && C == 0) {
                break;
            }

            // Lê as alturas finais
            int[] alturas = new int[C];
            for (int i = 0; i < C; i++) {
                alturas[i] = scanner.nextInt();
            }

            int contaPassoLaser = 0;
            int alturaCorrente = A;

            for (int i = 0; i < C; i++) {
                if (alturas[i] < alturaCorrente) {
                    contaPassoLaser += (alturaCorrente - alturas[i]);
                }
                alturaCorrente = alturas[i];
            }

            System.out.println(contaPassoLaser);
        }

        scanner.close();
    }
}