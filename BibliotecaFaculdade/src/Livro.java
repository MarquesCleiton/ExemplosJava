
public class Livro {
	private String  titulo;
	private String  autor;
	private int     anoPublicacao;
	private String  categoria;
	private int     numeroInstante;
	private int     numeroPrateleira;
	private boolean emprestado;

	public Livro(String titulo, String autor, int anoPublicacao, String categoria, int numeroInstante,
			int numeroPrateleira) {
		this.titulo           = titulo;
		this.autor            = autor;
		this.anoPublicacao    = anoPublicacao;
		this.categoria        = categoria;
		this.numeroInstante   = numeroInstante;
		this.numeroPrateleira = numeroPrateleira;
		this.emprestado       = false;
	}

	public void emprestar() {
		if (emprestado) {
			System.out.println("livro indisponível");
		} else {
			System.out.println("Livro está sendo emprestado");
			this.emprestado = true;
		}

	}

	public void devolver() {
		if (!emprestado) {
			System.out.println("O livro já foi devolvido!");
		} else {
			System.out.println("O livro está sendo devolvido");
			this.emprestado = false;
		}
	}

	public void infoLivro() {
		System.out.println("+----------------------------------------+");
		System.out.println("Titulo               : " + titulo);
		System.out.println("Autor                : " + autor);
		System.out.println("Ano de publicação    : " + anoPublicacao);
		System.out.println("Categoria            : " + categoria);
		System.out.println("Numero da Instante   : " + numeroInstante);
		System.out.println("Numero da Prateleira : " + numeroPrateleira);
		System.out.println("Situação emprestimo  : " + ((emprestado)?"Indisponível":"Disponível"));
		System.out.println("+-----------------------------------------+");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumeroInstante() {
		return numeroInstante;
	}

	public void setNumeroInstante(int numeroInstante) {
		this.numeroInstante = numeroInstante;
	}

	public int getNumeroPrateleira() {
		return numeroPrateleira;
	}

	public void setNumeroPrateleira(int numeroPrateleira) {
		this.numeroPrateleira = numeroPrateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
}
