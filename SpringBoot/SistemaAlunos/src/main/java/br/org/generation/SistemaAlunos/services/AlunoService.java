package br.org.generation.SistemaAlunos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.SistemaAlunos.dao.CursinhoRepo;
import br.org.generation.SistemaAlunos.model.Aluno;

@Component
public class AlunoService implements IAlunoService{

	@Autowired
	private CursinhoRepo cursinho;
	
	@Override
	public List<Aluno> listarAlunos() {
		return (List<Aluno>) cursinho.findAll();
	}
	
	@Override
	public Aluno recuperaPeloRa(int id) {
		return cursinho.findById(id).get();
	}

	@Override
	public void adicionarNovoAluno(Aluno aluno) {	
		cursinho.save(aluno);
	}
}