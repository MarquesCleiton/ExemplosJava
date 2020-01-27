package br.org.generation.SistemaAlunos.servicos;

import br.org.generation.SistemaAlunos.model.Aluno;

public interface IAlunoService {
	public void gravarAlunoNoBanco (Aluno aluno);
	public void atualizarAlunoNoBanco(Aluno aluno);
	public Aluno recuperarAlunoPorId(int id);
}
