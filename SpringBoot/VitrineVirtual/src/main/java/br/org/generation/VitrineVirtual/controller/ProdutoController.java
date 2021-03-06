package br.org.generation.VitrineVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.VitrineVirtual.model.Produto;
import br.org.generation.VitrineVirtual.services.IProdutoService;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	private IProdutoService servico;
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperaTudo());
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> mostrarPeloId(@PathVariable int id){
		Produto p = servico.recuperaPeloId(id);
		if(p!=null) {
			return ResponseEntity.ok(p);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "TESTE";
	}
}
