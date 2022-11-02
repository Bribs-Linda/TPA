import java.util.Scanner;

public class LucroProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor, lucro, venda;
        String r;
        boolean sair = false;

        do {
            System.out.println("Digite o valor do produto:");
            valor = sc.nextDouble();

            System.out.println("Digite a margem de lucro do produto em %:");
            lucro = sc.nextDouble();

            venda = valor + ((lucro / 100) * valor);
            System.out.println("O produto deve ser vendido por: R$" + venda);

            while (true) {
                System.out.println("Deseja continuar? (S/N)");
                r = sc.next();

                if (r.equalsIgnoreCase("S")){
                    System.out.println("O programa vai continuar \n");
                    break;
                } else if (r.equalsIgnoreCase("N")) {
                    System.out.println("Programa encerrado");
                    sair = true;
                    break;
                } else {
                    System.out.println("Resposta invalida, digite outra \n");
                }
            }

        } while (!sair);
    }
}
