import java.util.Scanner;

public class NovoVelho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0, menor, anoAtual, anoNasc, idade, posicaoMenor = 0, posicaoMaior = 0;

        System.out.println("Digite o ano atual:");
        anoAtual = sc.nextInt();
        menor = anoAtual;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o ano de nascimento do usuario " + i + ":");
            anoNasc = sc.nextInt();
            idade = anoAtual - anoNasc;
            System.out.println("Usuario " + i + " tem " + idade + " anos.\n");
            if (maior < idade) {
                maior = idade;
                posicaoMaior = i;
            }
            if (menor > idade) {
                menor = idade;
                posicaoMenor = i;
            }
        }

        System.out.println("Usuario " + posicaoMaior + " - MAIOR (" + maior + " anos).");
        System.out.println("Usuario " + posicaoMenor + " - MENOR (" + menor + " anos).");
    }
}
