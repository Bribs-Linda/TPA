import java.util.Scanner;

public class Mencao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos alunos receberam MB?");
        int mb = scan.nextInt();
        System.out.println("Quantos alunos receberam B?");
        int b = scan.nextInt();
        System.out.println("Quantos alunos receberam R?");
        int r = scan.nextInt();
        System.out.println("Quantos alunos receberam I?");
        int i = scan.nextInt();

        int total = mb + b + r + i;

        double pMb = (double) mb/total * 100;
        double pB = (double) b/total * 100;
        double pR = (double) r/total * 100;
        double pI = (double) i/total * 100;

        System.out.println("De qual menção deseja saber a porcentagem? Digite a numeração correspondente: MB (1) B (2) R (3) I (4)");
        int nota = scan.nextInt();

        switch (nota) {
            case 1:
                System.out.println("A porcentagem é de: " + pMb + "%");
                break;
            case 2:
                System.out.println("A porcentagem é de: " + pB + "%");
                break;
            case 3:
                System.out.println("A porcentagem é de: " + pR + "%");
                break;
            case 4:
                System.out.println("A porcentagem é de: " + pI + "%");
                break;
            default:
                System.out.println("Número inválido");
        }

    }
}
