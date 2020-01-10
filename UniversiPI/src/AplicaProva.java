import java.util.Scanner;
public class AplicaProva {
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		QuestaoSimples q[] = new QuestaoSimples[6];
		
		q[0] = new QuestaoSimples("De quem é a famosa frase “Penso, logo existo”?", "Descartes");
		q[1] = new QuestaoSimples("De onde é a invenção do chuveiro elétrico?", "Brasil");
		
		q[2] = new QuestaoMultiplaEscolha("Quais o menor e o maior país do mundo?", "Vaticano e Rússia",
				"Vaticano e Rússia", "Nauru e China", "Mônaco e Canadá", "Malta e Estados Unidos");
		q[3] = new QuestaoMultiplaEscolha("Quanto tempo a luz do Sol demora para chegar à Terra?",
				"8 minutos","12 minutos", "1 dia", "12 horas", "8 minutos");
		
		q[4] = new QuestaoComDica("Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?",
				"Caipora", "personagem do castelo RaTimBum");
		q[5] = new QuestaoComDica("As pessoas de qual tipo sanguíneo são consideradas doadores universais?", "Tipo O", "decima quinta letra do alfabeto");
		
		
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
		System.out.println("Pontuação:\nAcertos: " + a +"\nErros: " + e);
	}
}
