import java.util.Scanner;

public class Signo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número do seu mês de nascimento:");
        int mes = scan.nextInt();
        System.out.println("Digite o número do seu dia de nascimento:");
        int dia = scan.nextInt();

        switch (mes) {
            case 1:
                if (dia < 21) {
                    System.out.println("Capricórnio");
                } else if (dia <= 31) {
                    System.out.println("Aquário");
                }
                break;
            case 2:
                if (dia < 20) {
                    System.out.println("Aquário");
                } else if (dia <= 29) {
                    System.out.println("Peixes");
                }
                break;
            case 3:
                if (dia < 21) {
                    System.out.println("Peixes");
                } else if (dia <= 31) {
                    System.out.println("Áries");
                }
                break;
            case 4:
                if (dia < 21) {
                    System.out.println("Áries");
                } else if (dia <= 30) {
                    System.out.println("Touro");
                }
                break;
            case 5:
                if (dia < 21) {
                    System.out.println("Touro");
                } else if (dia <= 31) {
                    System.out.println("Gêmeos");
                }
                break;
            case 6:
                if (dia < 21) {
                    System.out.println("Gêmeos");
                } else if (dia <= 30) {
                    System.out.println("Câncer");
                }
                break;
            case 7:
                if (dia < 22) {
                    System.out.println("Câncer");
                } else if (dia <= 31) {
                    System.out.println("Leão");
                }
                break;
            case 8:
                if (dia < 23) {
                    System.out.println("Leão");
                } else if (dia <= 31) {
                    System.out.println("Virgem");
                }
                break;
            case 9:
                if (dia < 23) {
                    System.out.println("Virgem");
                } else if (dia <= 30) {
                    System.out.println("Libra");
                }
                break;
            case 10:
                if (dia < 23) {
                    System.out.println("Libra");
                } else if (dia <= 31) {
                    System.out.println("Escorpião");
                }
                break;
            case 11:
                if (dia < 22) {
                    System.out.println("Escorpião");
                } else if (dia <= 30) {
                    System.out.println("Sagitário");
                }
                break;
            case 12:
                if (dia < 22) {
                    System.out.println("Sagitário");
                } else if (dia <= 31) {
                    System.out.println("Capricórnio");
                }
                break;
            default:
                System.out.println("Mês inválido");
        }
    }
}
