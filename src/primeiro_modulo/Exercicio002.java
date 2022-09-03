package primeiro_modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CÓDIGO PARA REALIZAR O CÁLCULO DA ÁREA DE UM CÍRCULO.");
		System.out.print("Entre com o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
	}

}
