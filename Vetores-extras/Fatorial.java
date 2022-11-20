import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 15;
        long[] a, b;

        a = new long[SIZE];
        b = new long[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
            b[i] = a[i];
            for (int j = i; j > 0; j--) {
                b[i] *= j;
            }
        }

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
    }
}
