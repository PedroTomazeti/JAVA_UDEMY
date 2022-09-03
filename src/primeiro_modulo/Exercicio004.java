package primeiro_modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Código do funcionário: ");
		int code = sc.nextInt();
		System.out.print("Horas trabalhadas: ");
		int hour= sc.nextInt();
		System.out.print("Valor recebido por hora: ");
		double perHour= sc.nextDouble();
		
		double salario = hour * perHour;
		System.out.printf("NUMBER = %d%n", code);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ %.2f", salario);
	}

}
