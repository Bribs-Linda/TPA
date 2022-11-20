import java.util.Scanner;

public class Busca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SIZE = 10;
        int[] a;
        int x;
        boolean achado = false;

        a = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + " do vetor A:");
            a[i] = sc.nextInt();
        }

        System.out.println("Insira o valor que quer procurar:");
        x = sc.nextInt();

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
            if (a[i] == x) {
                achado = true;
                break;
            }
        }

        if (achado) {
            System.out.println(x + " pertence ao vetor A!");
        } else {
            System.out.println(x + " descabe ao vetor A!");
        }

        //Detalhe: Como minha IDE está sem UTF-8, evito usar acentos. E é por isso que usei a palavra descaber, que
        //descobri ser o único antônimo do verbo pertencer existente. Era só isso mesmo que tinha a dizer, bom dia.
    }
}
