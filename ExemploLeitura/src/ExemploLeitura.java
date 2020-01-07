//Biblioteca de leitura
//Classe Scanner do pacote java.util
import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String [] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		
		System.out.println("Digite o seu nome: ");
		//String texto = teclado.nextLine();
		System.out.println("Digite um valor inteiro: ");
		a = teclado.nextInt();
		System.out.println("Digite um valor real   : ");
		b = teclado.nextFloat();
		System.out.println("voce digitou os valores " + a + " e " + b);
		
		teclado.close();
	}
}
