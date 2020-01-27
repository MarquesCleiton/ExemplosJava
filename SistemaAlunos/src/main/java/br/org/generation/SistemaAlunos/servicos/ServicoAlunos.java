package br.org.generation.SistemaAlunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.SistemaAlunos.dao.IAlunoBD;
import br.org.generation.SistemaAlunos.model.Aluno;

@Component
public class ServicoAlunos implements IAlunoService {
	
	@Autowired	   //indica que o gerenciamento desse objeto é por conta do SpringBoot
	IAlunoBD repo; //repo é de repositório (uma alusão ao banco de dados)

	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		}catch(Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno");
		}
		
		
	}

	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		}catch(Exception ex) {
			throw new RuntimeException("Erro ao atualizar novo aluno");
		}
	}

	public Aluno recuperarAlunoPorId(int id) {
		
		return repo.findById(id).get();
	}



}
