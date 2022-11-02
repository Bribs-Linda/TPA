import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero:");
        int n = sc.nextInt(), f = 1;

        for (int i = n; i > 0; i--) {
            f *= i;
        }

        System.out.println("Fatorial de " + n + " = " + f);
    }
}