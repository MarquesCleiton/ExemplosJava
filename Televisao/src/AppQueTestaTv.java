
import java.util.Scanner;

public class AppQueTestaTv {
	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		// Declarei que t1 vai "manipular" uma TV
		Televisao t1;
		// reservo um espaço de memória para isso já passando os atributos
		t1 = new Televisao("Gradient", 110, 32);

//		t1.setMarca("Gradient");
//		t1.setVoltagem(110);
//		t1.setTamanho(32);
		t1.setLigada(false);
		t1.setCanal(9);
		t1.setVolume(2);

		t1.switchPower();
		t1.aumentarVolume();
		t1.diminuirVolume();
		t1.MayWhy();

		do {
			System.out.println("***********************************");
			System.out.println("        Controle remoto da TV      ");
			System.out.println("-----------------------------------");
			System.out.println(" 1 - Ligar/Desligar                ");
			System.out.println(" 2 - Aumentar Volume               ");
			System.out.println(" 3 - Diminuir Volume               ");
			System.out.println(" 4 - Avançar Canal                 ");
			System.out.println(" 5 - Voltar  Canal                 ");
			System.out.println("-1 - Encerrar Sistema              ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;
			case 4:
				t1.avancarCanal();
				break;
			case 5:
				t1.voltarCanal();
				break;
			case 6:
				opcao = 0;
				break;
			}
			System.out.println("\n");
		} while (opcao != 0);
		System.out.println("");
	}

}
