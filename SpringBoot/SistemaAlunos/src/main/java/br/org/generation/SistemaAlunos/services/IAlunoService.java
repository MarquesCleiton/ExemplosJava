package br.org.generation.SistemaAlunos.services;

import java.util.List;

import br.org.generation.SistemaAlunos.model.Aluno;

public interface IAlunoService {
	public void adicionarNovoAluno(Aluno aluno);
	public List<Aluno> listarAlunos();
	public Aluno recuperaPeloRa(int id);
}
