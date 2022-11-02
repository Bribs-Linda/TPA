public class Pares500 {
    public static void main(String[] args) {

        int numeros = 1;

        do {
            if (numeros % 2 == 0) System.out.print(numeros + " | ");
            numeros++;
        } while (numeros<=500);
    }
}
