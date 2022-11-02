public class Somatoria {
    public static void main (String[] args) {
        int i = 1;
        int res = 0;

        while (i<=100) {
            res = res + i;
            i++;
        }
        System.out.println("O resultado da soma dos números de 1 a 100 é: " + res);
    }
}
