package br.org.generation.SistemaAlunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.SistemaAlunos.model.Aluno;
import br.org.generation.SistemaAlunos.services.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {
	@Autowired
	private IAlunoService alserv;
	
	@GetMapping("/alunos")
	public ResponseEntity <List<Aluno>> todosAlunos(){
		return ResponseEntity.ok(alserv.listarAlunos());
	}
	
	@GetMapping("/alunos/{id}")
	public ResponseEntity<Aluno> buscarId(@PathVariable int id){
		Aluno a = alserv.recuperaPeloRa(id);
		
		if (a!=null) {
			return ResponseEntity.ok(a);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/alunos/novo")
	public ResponseEntity<Aluno> incluirNovo(@RequestBody Aluno aluno){
		alserv.adicionarNovoAluno(aluno);
	return ResponseEntity.ok(aluno);
	}
}
