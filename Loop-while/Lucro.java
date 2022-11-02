import java.util.Scanner;

public class Lucro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        int a = 2;

        while (i < a) {
            System.out.println("Digite o valor do produto:");
            double valor = scan.nextDouble();

            System.out.println("Digite a margem de lucro do produto em %:");
            double lucro = scan.nextDouble();

            double venda = ((lucro / 100) * valor) + valor;
            System.out.println("O produto foi vendido por: R$" + venda);

            System.out.println("Deseja continuar a execução? (S/N)");
            String res = scan.next();

            if (res.equalsIgnoreCase("N")) {
                a = 1;
            } else if (res.equalsIgnoreCase("S")) {
                System.out.println("A execução vai prosseguir");
            } else {
                System.out.println("Resposta inválida");
                a = 1;
            }
        }
    }
}
