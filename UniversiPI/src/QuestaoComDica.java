
public class QuestaoComDica extends QuestaoSimples{
	private String dica;
	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	
	public String aplicaQuestao() {
		String msg  = "Questão:\n" + super.getEnunciado() + "\n\n";
			   msg += "Dica: " + this.dica;
		return msg;
	}
}
