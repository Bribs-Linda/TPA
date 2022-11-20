import java.text.DecimalFormat;
import java.util.Scanner;

public class Raizes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Criando constante de tamanho e os vetores.
        final int SIZE = 10;
        double[] a, b;

        //Definindo o tamanho do vetor.
        a = new double[SIZE];
        b = new double[SIZE];

        //Lendo os valores do vetor A e armazenando a raiz quadrada desses valores no vetor B
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Insira o valor " + (i + 1) + ":");
            a[i] = sc.nextInt();
            b[i] = Math.sqrt(a[i]);
        }

        //Apresentando os resultados

        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor A = [" + df.format(a[i]) + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.print(df.format(a[i]) + "]\n");
            } else {
                System.out.print(df.format(a[i]) + ", ");
            }
        }
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("Vetor B = [" + df.format(b[i]) + ", ");
            } else if (i == (SIZE - 1)) {
                System.out.print(df.format(b[i]) + "]");
            } else {
                System.out.print(df.format(b[i]) + ", ");
            }
        }
    }
}
