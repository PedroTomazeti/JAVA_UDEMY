package primeiro_modulo;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("PROGRAMA PARA LER 4 NÚMEROS INTEIROS.");
		System.out.print("Primeiro número: ");
		int A = sc.nextInt();
		System.out.print("Segundo número: ");
		int B = sc.nextInt();
		System.out.print("Terceiro número: ");
		int C = sc.nextInt();
		System.out.print("Quarto número: ");
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d", diferenca);
	}

}
