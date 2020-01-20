package br.org.generation.WebMotors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.WebMotors.bd.BDCliente;
import br.org.generation.WebMotors.model.Cliente;

@RestController
public class ClienteController {

	private BDCliente bd = new BDCliente();

	// Create
	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente) {
		bd.gravar(cliente);
		return ResponseEntity.ok(cliente);
	}
	
	// Read
	@GetMapping("/cliente/{id}") // {VARIÁVEL}
	// @PathVariabl associa o parametro do URL a variável de mesmo nome
	public ResponseEntity<Cliente> getCliente(@PathVariable int id) {
		Cliente cli = bd.busca(id);
		if (cli != null) { // Encontrou o cliente
			return ResponseEntity.ok(cli);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	// READ
	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());
	}

	// UPDATE
	@PutMapping("/cliente/atualizar")
	public ResponseEntity<String> atualiza(@RequestBody Cliente c) {
		if(bd.atualiza(c)) {
			return ResponseEntity.ok("ATUALIZADO");
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	// DELETE
	@DeleteMapping("/cliente/apagar/{id}")
	public ResponseEntity<String> atualiza(@PathVariable int id) {
		
		if(bd.apagar(id)) {
			return ResponseEntity.ok("APAGADO");
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	
//	@GetMapping("/veiculo/teste")
//	public Veiculo testeVeiculo() {
//		
//		Veiculo v = new Veiculo();
//		
//		v.setId(1234);
//		v.setMarca("Chevrolet");
//		v.setModelo("ONIX");
//		v.setTipo("casual");
//		v.setAno(2013);
//		v.setCor("prata");
//		v.setPreco(31500f);
//		v.setDetalhes("Veículo BOM!");
//		
//		return v;
//	}

	@GetMapping("cliente/teste")
	public Cliente testeCliente() {
		Cliente c = new Cliente();
		c.setId(42);
		c.setNome("Matheus");
		c.setDataNasc("01/07/1998");
		c.setEmail("matheus.m.prestes@gmail.com");
		c.setCpf("123.456.789-10");
		c.setTelefone("(70)7070-7070");
		return c;
	}
}