import java.util.Scanner;

public class Futebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int id = scan.nextInt();

        switch (id) {
            case 6:
                System.out.println("Você é um dente de leite");
                break;
            case 7:
                System.out.println("Você é um júnior");
                break;
            case 8:
                System.out.println("Você é um júnior max");
                break;
            case 9:
                System.out.println("Você é um júnior master");
                break;
            case 10:
                System.out.println("Você é um master");
                break;
            default:
                System.out.println("Idade inválida");
        }
    }
}
