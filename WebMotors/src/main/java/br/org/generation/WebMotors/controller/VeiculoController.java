package br.org.generation.WebMotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.org.generation.WebMotors.bd.BDVeiculo;
import br.org.generation.WebMotors.model.Veiculo;

@RestController
public class VeiculoController {
	
	private BDVeiculo bd = new BDVeiculo();
	
	//Create
	@GetMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo){
		bd.gravar(veiculo);
		return ResponseEntity.ok(veiculo);
	}
	
	// Read
	@GetMapping("/veiculo/{id}") // {VARIÁVEL}
	// @PathVariabl associa o parametro do URL a variável de mesmo nome
	public ResponseEntity<Veiculo> getveiculo(@PathVariable int id) {
		Veiculo v = bd.buscar(id);
		if (v != null) { // Encontrou o cliente
			return ResponseEntity.ok(v);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	// READ
	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos() {
		return ResponseEntity.ok(bd.buscaTodos());
	}

	// UPDATE
	@PutMapping("/veiculo/atualizar")
	public ResponseEntity<String> atualiza(@RequestBody Veiculo v) {
		if(bd.atualizar(v)) {
			return ResponseEntity.ok("ATUALIZADO");
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	// DELETE
	@DeleteMapping("/veiculo/apagar/{id}")
	public ResponseEntity<String> atualiza(@PathVariable int id) {
		
		if(bd.apagar(id)) {
			return ResponseEntity.ok("APAGADO");
		}else {
			return ResponseEntity.notFound().build();
		}
	}

}
