
public class QuestaoMultiplaEscolha extends QuestaoSimples {

	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String al1, String al2, String al3, String al4) {
		super(enunciado, resposta);
		this.alternativa1 = "a)" + al1;
		this.alternativa2 = "b)" + al2;
		this.alternativa3 = "c)" + al3;
		this.alternativa4 = "d)" + al4;
	}
	
	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}

	@Override
	public String aplicaQuestao() {
		String msg = "Questão:\n";
		msg += this.getEnunciado() + "\n\n";
		msg += "Alternativas:\n";
		msg += this.alternativa1 + "\n";
		msg += this.alternativa2 + "\n";
		msg += this.alternativa3 + "\n";
		msg += this.alternativa4 + "\n";
		return msg;
	}
}
