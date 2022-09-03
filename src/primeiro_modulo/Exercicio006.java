package primeiro_modulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor A: ");
		double A = sc.nextDouble();
		System.out.print("Valor B: ");
		double B = sc.nextDouble();
		System.out.print("Valor C: ");
		double C = sc.nextDouble();

		double areaT = (A * C) / 2;
		double areaC = Math.PI * Math.pow(C, 2);
		double areaTrap = ((A + B) * C) / 2;
		double areaQ = Math.pow(B, 2);
		double areaR = A * B;
		
		Locale.setDefault(Locale.US);
		System.out.printf("TRIANGULO: %.3f%n", areaT);
		System.out.printf("CIRCULO: %.3f%n", areaC);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		System.out.printf("QUADRADO: %.3f%n", areaQ);
		System.out.printf("RETANGULO: %.3f%n", areaR);
	}

}
