import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] a;
        boolean primo = true;

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
            if (a[i] == 1) {
                primo = false;
            }
            for (int j = 2; j <= a[i]; j++) {
                if (a[i] % j == 0 && j != a[i]) {
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }
            if (!primo) {
                System.out.println(a[i] + " não é primo!");
            } else {
                System.out.println(a[i] + " é primo!");
            }
        }
    }
}
