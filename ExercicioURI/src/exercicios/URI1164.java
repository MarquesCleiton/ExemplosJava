package exercicios;
import java.util.Scanner;
public class URI1164 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		int cont = 0;
		int soma = 0;
		do {
			cont++;
			if(n % cont == 0 )
				soma += cont;
		}while(soma<n);
		
		System.out.println("Soma: " + soma);
		
		if(soma == n)
			System.out.println(n + " eh perfeito");
		else
			System.out.println(n + " nao eh perfeito");
	}
}
