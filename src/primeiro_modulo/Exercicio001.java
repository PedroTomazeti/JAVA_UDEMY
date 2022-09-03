package primeiro_modulo;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAMA PARA FAZER A SOMA DOS NÚMEROS.");
		System.out.print("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		int num2 = sc.nextInt();
		int soma = num1 + num2;
		System.out.printf("SOMA = %d", soma);
	}

}
