package br.org.generation.WebMotors.bd;

import java.util.ArrayList;

import br.org.generation.WebMotors.model.Cliente;

public class BDCliente {
	private ArrayList <Cliente> lista;
	
	public BDCliente() {
		lista = new ArrayList<Cliente>();
	}
	
	//Create
	public void gravar(Cliente c) {
		lista.add(c);
	}
	
	//Read
	public Cliente busca(int id) {
		Cliente c = null;
		for(Cliente cli: lista) {
			if (cli.getId() == id) {
				c = cli;
				break;
			}
		}
		return c;
	}
	
	//Update
	public boolean atualiza(Cliente c) {
		int posicao = -1;
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).getId() == c.getId()) {
				posicao = i;
				break;
			}
		}
		
		if(posicao>=0) {
			lista.set(posicao, c);
			return true;
		}
		return false;
	}
	
	//Delete
	public boolean apagar(int id) {
		int posicao = -1;
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		
		if(posicao>=0) {
			lista.remove(posicao);
			return true;
		}
		return false;
	}
	
	public ArrayList<Cliente> buscarTodos(){
		return this.lista;
	}
}
