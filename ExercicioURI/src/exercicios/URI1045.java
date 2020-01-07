package exercicios;

import java.util.Scanner;

public class URI1045 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double A = 0, B = 0, C = 0;

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();

		if (a > b && a > c) {
			A = a;
			if (b > c) {
				B = b;
				C = c;
			} else {
				B = c;
				C = b;
			}
		} else if (b > a && b > c) {
			A = b;
			if (a > c) {
				B = a;
				C = c;
			} else {
				B = c;
				C = a;
			}
		} else {
			A = c;
			if (a > b) {
				B = a;
				C = b;
			} else {
				B = b;
				C = a;
			}
		}

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if ((A * A) == (B * B + C * C))
				System.out.println("TRIANGULO RETANGULO");

			if ((A * A) > (B * B + C * C))
				System.out.println("TRIANGULO OBTUSANGULO");

			if ((A * A) < (B * B + C * C))
				System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C)
				System.out.println("TRIANGULO EQUILATERO");
			
			if (A == B && C != A || A == C && A != B || C == B && C!= A)
				System.out.println("TRIANGULO ISOSCELES");
		}
	}
}
