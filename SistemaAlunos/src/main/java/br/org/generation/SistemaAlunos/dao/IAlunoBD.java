package br.org.generation.SistemaAlunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.SistemaAlunos.model.Aluno;

public interface IAlunoBD extends CrudRepository<Aluno, Integer>{

}