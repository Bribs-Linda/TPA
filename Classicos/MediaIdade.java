import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade, maior = 0, menor;
        double media;

        System.out.println("Entre com a idade da pessoa 1:");
        idade = sc.nextInt();
        menor = idade;
        media = idade;

        for (int i = 2; i <= 10; i++) {
            System.out.println("Entre com a idade da pessoa " + i + ":");
            idade = sc.nextInt();
            if (idade > maior) {
                maior = idade;
            } else if (idade < menor) {
                menor = idade;
            }
            media += idade;
        }

        media /= 10;

        System.out.println("A média entre as idades é " + media);
        System.out.println("O mais jovem tem " + menor + " ano(s)");
        System.out.println("O mais velho tem " + maior + " ano(s)");
    }
}
