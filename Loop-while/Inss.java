import java.util.Scanner;

public class Inss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;

        while (i<=4) {
            System.out.println("Digite o " + i + "º salário:");
            double sal = scan.nextDouble();

            if (sal<2000) {
                sal = sal * 0.085;
                System.out.println("O desconto do INSS será de: R$" + sal);
            } else {
                sal = sal * 0.11;
                System.out.println("O desconto do INSS será de: R$" + sal);
            }
            i++;
        }
    }
}
