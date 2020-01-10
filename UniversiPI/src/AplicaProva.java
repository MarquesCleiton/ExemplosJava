import java.util.Scanner;
public class AplicaProva {
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples q[] = new QuestaoSimples[6];
		
		q[0] = new QuestaoSimples("De quem � a famosa frase �Penso, logo existo�?", "Descartes");
		q[1] = new QuestaoSimples("De onde � a inven��o do chuveiro el�trico?", "Brasil");
		
		q[2] = new QuestaoMultiplaEscolha("Quais o menor e o maior pa�s do mundo?", "Vaticano e R�ssia",
				"Vaticano e R�ssia", "Nauru e China", "M�naco e Canad�", "Malta e Estados Unidos");
		q[3] = new QuestaoMultiplaEscolha("Quanto tempo a luz do Sol demora para chegar � Terra?",
				"8 minutos","12 minutos", "1 dia", "12 horas", "8 minutos");
		
		q[4] = new QuestaoComDica("Qual personagem folcl�rico costuma ser agradado pelos ca�adores com a oferta de fumo?",
				"Caipora", "personagem do castelo RaTimBum");
		q[5] = new QuestaoComDica("As pessoas de qual tipo sangu�neo s�o consideradas doadores universais?", "Tipo O", "decima quinta letra do alfabeto");
		
		
		int a = 0, e = 0;
		for(int i = 0; i < q.length; i++){	
			System.out.println("-------------------------------");
			System.out.println(q[i].aplicaQuestao());
			String resp = teclado.nextLine();
			if(q[i].corrigir(resp)) {
				System.out.println("Acertou Miseravi");
				a++;
			}else {
				System.out.println("ERROU!!!!!");
				System.out.println("Resposta correta: " + q[i].getResposa() + "\n");
				e++;
				
			}
			System.out.println("-------------------------------\n");
		}
		System.out.println("Pontua��o:\nAcertos: " + a +"\nErros: " + e);
	}
}
