package exercicios;
import java.util.Scanner;

public class URI1160 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int t = teclado.nextInt();
		String[] msg= new String[t];
		for(int i = 1; i<= t; i++) {
			int pa = teclado.nextInt();
			int pb = teclado.nextInt();
			double g1 = teclado.nextDouble()/100;
			double g2 = teclado.nextDouble()/100;
			
			int anos = 0;
			while(pa<=pb && anos <=100 ) {
				pa = (int)(pa + pa*g1);
				pb = (int)(pb + pb*g2);
				anos ++;
				System.out.println("Ano: "+anos+" Cidade A: " + pa + "|" + " Cidade B: " + pb);
			}
			if(anos>100) {
				msg[i-1]= "Mais de 1 seculo.";
			}else {
				msg[i-1]= anos+" anos.";
			}		
		}
		System.out.println(msg[0]);
		for(int i = 0; i< t; i++) {
			System.out.println("0"+msg[i]);
		}
		teclado.close();
	}

}
