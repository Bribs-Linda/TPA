import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoAtual, anoNasc, idade, r;
        boolean sair = false;

        do {
            System.out.println("Informe o ano atual:");
            anoAtual = sc.nextInt();
            System.out.println("Informe o ano em que nasceu:");
            anoNasc = sc.nextInt();
            idade = anoAtual - anoNasc;
            System.out.println("Idade: " + idade);
            if (idade < 18) {
                System.out.println("Menor de idade\n");
            } else {
                System.out.println("Maior de idade\n");
            }



            while (true) {
                System.out.println("Deseja continuar? (SIM - 1 / NAO - 2)");
                r = sc.nextInt();
                if (r == 1) {
                    System.out.println("Voce decidiu continuar\n");
                    break;
                } else if (r == 2) {
                    System.out.println("Programa finalizado");
                    sair = true;
                    break;
                } else {
                    System.out.println("Numero invalido, digite novamente\n");
                }
            }

        } while (!sair);
    }
}
