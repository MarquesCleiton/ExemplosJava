
/**
 * 
 * @author Generation
 *
 */
public class Hello {
	public static void main(String[] args) {

		float salarioM, qtdkw;
		
		salarioM = Float.parseFloat(args[0]);
		qtdkw = Float.parseFloat(args[1]);
		
		float valor1kw = salarioM / 700;
		float valorTotal = valor1kw * qtdkw;
		
		float desc = valorTotal * 0.9f;
		
		System.out.println("Valor 1 kw R$ " + valor1kw);
		System.out.println("valor total R$ " + valorTotal);
		System.out.println("Valor com 10% de desconto R$ " + desc);
		
//		System.out.print("Hello World");
//
//		int v1, v2;
//		v1 = Integer.parseInt(args[0]);
//		v2 = Integer.parseInt(args[1]);
//		int res = v1 + v2;
//		System.out.println("Soma: " + res);
//
//		// System - Sistema Operacional
//		// out - monitor de vídeo
//		// print - exibição

	}
}
