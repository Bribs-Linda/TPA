import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] a;

        a = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
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
            System.out.println("Divisores de " + a[i] + ":");
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.println(j + " ");
                }
            }
            System.out.println();
        }

    }
}
