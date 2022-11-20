public class Potencia {
    public static void main(String[] args) {

        final int SIZE = 11;
        int[] a;

        a = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            a[i] = 1;
            for (int j = i; j > 0; j--) {
                a[i] *= 2;
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
    }
}
