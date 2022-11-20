import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] a;
        boolean palindromo = true;

        a = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            if (a[i] != a[SIZE - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("O vetor representa um palindromo");
        } else {
            System.out.println("O vetor NAO representa um palindromo");
        }
    }
}
