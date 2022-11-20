import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 5;
        int[] a;

        a = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Tabuada do " + a[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(a[i] + " * " + j + " = " + (a[i] * j));
            }
            System.out.println();
        }
    }
}
