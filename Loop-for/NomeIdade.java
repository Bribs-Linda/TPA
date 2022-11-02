import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, nomeNovo, nomeVelho;
        int idade, idNovo, idVelho;

        System.out.println("Digite o nome e a idade da pessoa 1:");
        nome = sc.next();
        idade = sc.nextInt();

        nomeNovo = nome;
        nomeVelho = nome;
        idNovo = idade;
        idVelho = idade;

        for (int i = 1; i <= 9; i++) {
            System.out.println("Digite o nome e a idade da pessoa " + (i+1) + ":");
            nome = sc.next();
            idade = sc.nextInt();

            if (idade > idVelho) {
                idVelho = idade;
                nomeVelho = nome;
            } else if (idade < idNovo) {
                idNovo = idade;
                nomeNovo = nome;
            }
        }

        System.out.println("Mais novo: " + nomeNovo + ", " + idNovo + " anos");
        System.out.println("Mais velho: " + nomeVelho + ", " + idVelho + " anos");
    }
}
