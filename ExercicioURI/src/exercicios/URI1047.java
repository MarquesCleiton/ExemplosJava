package exercicios;
import java.util.Scanner;
public class URI1047 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		int hi = teclado.nextInt();
		int mi = teclado.nextInt();
		int hf = teclado.nextInt();
		int mf = teclado.nextInt();
		
		int horas = 0;
		int minutos = 0;
		
		if(hi >= hf) {
			horas = 24 - hi + hf;
		}else {
			horas = hf - hi;
		}
		if (mi > mf) {
			minutos = 60 - mi + mf;
			horas -=1;
		}else {
			minutos = mf - mi;
		}
		System.out.println("O JOGO DUROU "+horas+" HORA(S) E "+minutos+" MINUTO(S)");
	}
}
