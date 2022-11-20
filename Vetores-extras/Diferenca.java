import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] a, b, c;
        boolean check = true;
        int tam = SIZE, k = 0;

        a = new int[SIZE];
        b = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor B:");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (a[i] == b[j]) {
                    tam--;
                }
            }
        }

        c = new int[tam];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (a[i] == b[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                c[k] = a[i];
                k++;
            }
            check = true;
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

        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                System.out.print("Vetor C = [" + c[i] + ", ");
            } else if (i == (c.length - 1)) {
                System.out.println(c[i] + "]");
            } else {
                System.out.print(c[i] + ", ");
            }
        }

    }
}
