
import java.util.Scanner;
public class URI1017 {
	public static void main(String [] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int horas = teclado.nextInt();
		int kmphm = teclado.nextInt();
		
		double qtdLitros = (horas * kmphm)/12f;
		
		System.out.printf("%.3f",qtdLitros);
		teclado .close();
	}
}
