import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 20;
        int[] a, b;
        int j = 0;

        a = new int[SIZE];
        b = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }

        for (int i = 0; i < SIZE; i++) {
            if (a[i] % 2 != 0) {
                b[j] = a[i];
                j++;
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
