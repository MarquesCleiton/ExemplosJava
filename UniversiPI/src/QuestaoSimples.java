
public class QuestaoSimples {
	private String enunciado;
	private String resposa;
	
	public QuestaoSimples(String enunciado, String resposta){
		this.enunciado = enunciado;
		this.resposa = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposa() {
		return resposa;
	}

	public void setResposa(String resposa) {
		this.resposa = resposa;
	}
	
	public String aplicaQuestao() {
		String msg = "Questão:\n" + this.enunciado;
		return msg;
	}
	
	public boolean corrigir(String resposta) {
		if(this.resposa.equals(resposta)){
			return true;
		}else {
			return false;
		}
	}
}
