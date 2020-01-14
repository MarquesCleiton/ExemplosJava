import java.util.Scanner;
public class loljinha {
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		Produto p[] = new Produto[5];
		int cont = 0;
		
		do {
			try {
			System.out.println("---------------------------------------");
			p[cont] = new Produto();
			
			System.out.println("ID:");
			p[cont].setId(Integer.parseInt(teclado.nextLine()));
			
			System.out.println("Nome:");
			p[cont].setNome(teclado.nextLine());
			
			System.out.println("Preço:");
			p[cont].setPreco(Float.parseFloat(teclado.nextLine()));
			
			System.out.println("Quantidade em estoque:");
			p[cont].setQtdEsoque(Float.parseFloat(teclado.nextLine()));
			
			System.out.println("detalhes:");
			p[cont].setDetalhes(teclado.nextLine());
			
			cont++;
			System.out.println("---------------------------------------");
			
			}catch(Exception ex) {
				System.out.println("ERRO: " + ex.getMessage());
			}
		}while(cont<5);
		
		for(int i = 0; i<p.length; i++) {
			p[i].info();
		}
		
	}
}
