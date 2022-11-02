public class Altura {
    public static void main (String[] args) {
        int ano = 0;

        double j = 134;
        double p = 145;

        while (j<=p) {
            j = j + 2.5;
            p = p + 2;
            ano++;
        }

        System.out.println("Vai demorar " + ano + " anos para João ser mais alto do que Pedro");
    }
}
