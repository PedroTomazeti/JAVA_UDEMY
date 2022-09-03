package primeiro_modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("C�digo pe�a 1: ");
		int code1 = sc.nextInt();
		System.out.print("N�meros de pe�as: ");
		int quant1 = sc.nextInt();
		System.out.print("Valor unit�rio pe�a 1: ");
		double unit1 = sc.nextDouble();
		System.out.print("C�digo pe�a 2: ");
		int code2 = sc.nextInt();
		System.out.print("N�meros de pe�as: ");
		int quant2 = sc.nextInt();
		System.out.print("Valor unit�rio pe�a 2: ");
		double unit2 = sc.nextDouble();
		double total = quant1 * unit1 + quant2 * unit2;
		Locale.setDefault(Locale.US);
		System.out.println("");
		System.out.println("NOTA FISCAL");
		System.out.printf("C�digo da pe�a 1: %d%n", code1);
		System.out.printf("Quantidade desejada: %d%n", quant1);
		System.out.printf("Valor por cada pe�a: %.2f%n", unit1);
		System.out.printf("C�digo da pe�a 2: %d%n", code2);
		System.out.printf("Quantidade desejada: %d%n", quant2);
		System.out.printf("Valor por cada pe�a: %.2f%n", unit2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
	}

}
