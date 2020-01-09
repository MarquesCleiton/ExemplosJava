import java.util.ArrayList;

public class Biblioteca {
	public static void main(String [] args) {
		Livro l1, l2;
		
		l1 = new Livro("MayWhyrio", "Mayara", 2020, "Games", 1, 10);
		l1.infoLivro();
		l1.emprestar();
		l1.emprestar();
		l1.infoLivro();
		l1.devolver();
		l1.infoLivro();
		
		l2 = l1;
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("-----L2-----");
		l2.emprestar();
		System.out.println("------------");
		System.out.println("-----L1-----");
		l1.infoLivro();
		System.out.println("------------");
		
		int a = 2;
		int b = 2;
		
		ArrayList<Livro> l3 = new ArrayList();
		
		l3.add(l1);
		l3.add(l1);
		
		l3.get(0).infoLivro();
		
		
		
	}
}
