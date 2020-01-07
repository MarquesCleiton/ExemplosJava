package exercicios;
import java.util.Scanner;
public class URI1101 {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int a, b;
		while((a=teclado.nextInt())>0 && (b = teclado.nextInt())>0) {
			int A, B;
			int sum = 0;
			
			if(a < b) {
				A = a;
				B = b;
			}else {
				A = b;
				B = a;
			}
			
			for(int i = A; i<=B; i++) {
				sum +=i;
				System.out.print(i+" ");
			}
			System.out.println("Sum="+sum);
		}
		teclado.close();
	}
}
