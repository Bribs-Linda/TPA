import java.util.Scanner;

public class Inss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, desc;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Escreva o ganho do empregado " + i + ":");
            salario = sc.nextDouble();
            if (salario < 2000) {
                desc = salario * 0.085;
                salario *= 0.915;
            } else {
                desc = salario * 0.11;
                salario *= 0.89;
            }

            System.out.println("Desconto do INSS do empregado " + i + " = " + desc);
            System.out.println("Salario com desconto = " + salario + "\n");
        }
    }
}
