import java.text.DecimalFormat;
import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("0.00");
		Scanner sc = new Scanner (System.in);
		double pessoas, f15 = 0, f30 = 0, f45 = 0, f60 = 0, f61 = 0;
		
		for (int i = 1; i <= 15; i++) {
			pessoas = sc.nextInt();
			
			if (pessoas <= 15) {
				f15++;
			} else if (pessoas <= 30) {
				f30++;
			} else if (pessoas <= 45) {
				f45++;
			} else if (pessoas <= 60) {
				f60++;
			} else {
				f61++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pessoas em cada faixa et�ria e sua respectiva porcentagem:");
		System.out.println("At� 15: " + f15 + " | " + df.format((f15/15) * 100) + "%");
		System.out.println("De 16 a 30: " + f30 + " | " + df.format((f30/15) * 100) + "%");
		System.out.println("DE 31 a 45: " + f45 + " | " + df.format((f45/15) * 100) + "%");
		System.out.println("De 46 a 60: " + f60 + " | " + df.format((f60/15) * 100) + "%");
		System.out.println("Acima de 61: " + f61 + " | " + df.format((f61/15) * 100) + "%");
	}

}
