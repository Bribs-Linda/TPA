import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] a, copiaA, b, c;
        boolean ordenado = true;
        int recipiente;

        a = new int[SIZE];
        copiaA = new int[SIZE];
        b = new int[SIZE];
        c = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
            copiaA[i] = a[i];
        }

        while (true) {
            for (int i = 0; (i + 1) < SIZE; i++) {
                if (copiaA[i] > copiaA[i + 1]) {
                    recipiente = copiaA[i];
                    copiaA[i] = copiaA[i + 1];
                    copiaA[i + 1] = recipiente;
                }
            }
            for (int i = 0; (i + 1) < SIZE; i++) {
                if (copiaA[i] > copiaA[i + 1]) {
                    ordenado = false;
                    break;
                }
            }
            if (ordenado) {
                break;
            }
            ordenado = true;
        }

        System.arraycopy(copiaA, 0, b, 0, SIZE);

        while (true) {
            for (int i = 0; (i + 1) < SIZE; i++) {
                if (copiaA[i] < copiaA[i + 1]) {
                    recipiente = copiaA[i];
                    copiaA[i] = copiaA[i + 1];
                    copiaA[i + 1] = recipiente;
                }
            }
            for (int i = 0; (i + 1) < SIZE; i++) {
                if (copiaA[i] < copiaA[i + 1]) {
                    ordenado = false;
                    break;
                }
            }
            if (ordenado) {
                break;
            }
            ordenado = true;
        }

        System.arraycopy(copiaA, 0, c, 0, SIZE);
        
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor A = [" + a[i] + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor B = [" + b[i] + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.println(b[i] + "]");
            } else {
                System.out.print(b[i] + ", ");
            }
        }

        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor C = [" + c[i] + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.println(c[i] + "]");
            } else {
                System.out.print(c[i] + ", ");
            }
        }

    }
}
