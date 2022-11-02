import java.util.Scanner;
public class Potencia {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a base:");
        int b = scan.nextInt();
        System.out.println("Digite o expoente:");
        int e = scan.nextInt();
        int res = 1;

        while (e>0) {
            res = res * b;
            e--;
        }
        System.out.println("O resultado da potência é: " + res);
    }
}
