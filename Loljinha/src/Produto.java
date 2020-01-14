
public class Produto {
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qtdEsoque;
	
//	public Produto(int id, String nome, String detalhes, float preco, float qtdEsoque) {
//		this.id = id;
//		this.nome = nome;
//		this.detalhes = detalhes;
//		this.preco = preco;
//		this.qtdEsoque = qtdEsoque;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if(id <= 0) {
			throw new RuntimeException("Id não pode ser MENOR ou igual a ZERO ( 0 )");
		}
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.equals(null) || nome.length() == 0) {
			throw new RuntimeException("Nome não pode ser Vazio");
		}
		this.nome = nome;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		if(detalhes.equals(null) || detalhes.length() == 0) {
			throw new RuntimeException("Detalhes não pode ser Vazio");
		}
		this.detalhes = detalhes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if(preco <= 0) {
			throw new RuntimeException("Preço NÃO pode ser MENOR ou IGUAL a ZERO (0)");
		}
		this.preco = preco;
	}

	public float getQtdEsoque() {
		return qtdEsoque;
	}

	public void setQtdEsoque(float qtdEsoque) {
		if(preco <= 0) {
			throw new RuntimeException("Estoque NÃO pode ser MENOR ou IGUAL a ZERO (0)");
		}
		this.qtdEsoque = qtdEsoque;
	}
	
	public void info() {
		System.out.println("id       :" + this.id);
		System.out.println("Nome     :" + this.nome);
		System.out.println("preço    :" + this.preco);
		System.out.println("detalhes :" + this.detalhes);
		System.out.println("Estoque  :" + this.qtdEsoque);
	}
}
