package primeiro_modulo;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("PROGRAMA PARA LER 4 N�MEROS INTEIROS.");
		System.out.print("Primeiro n�mero: ");
		int A = sc.nextInt();
		System.out.print("Segundo n�mero: ");
		int B = sc.nextInt();
		System.out.print("Terceiro n�mero: ");
		int C = sc.nextInt();
		System.out.print("Quarto n�mero: ");
		int D = sc.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d", diferenca);
	}

}
