package br.org.generation.WebMotors.bd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import br.org.generation.WebMotors.model.Veiculo;

public class BDVeiculo {
	public ArrayList <Veiculo> lista;
	
	public BDVeiculo() {
		lista = new ArrayList<Veiculo>();
	}
	
	//Create
	public void gravar(Veiculo v) {
		lista.add(v);
	}
	
	//Read
	public Veiculo buscar(int id) {
		
		Veiculo v = new Veiculo();
		for(Veiculo ve: lista) {
			if (ve.getId() == id) {
				v = ve;
				break;
			}
		}
		return v;
	}
	
	//Update
	public boolean atualizar(Veiculo v) {
		int posicao = -1;
		
		for(int i = 0 ; i<=lista.size(); i++) {
			if (lista.get(i).getId() == v.getId()) {
				posicao = i;
			}
		}
		
		if(posicao>=0) {
			lista.set(posicao, v);
			return true;
		}
		
		return false;
	}
	
	//Delete
	public boolean apagar(int id) {
		int posicao = -1;
		
		for(int i = 0 ; i<=lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				posicao = i;
			}
		}
		
		if(posicao>=0) {
			lista.remove(posicao);
			return true;
		}
		return false;
	}
	
	// Mostrar Tudo!
	public ArrayList<Veiculo> buscaTodos(){
		return this.lista;
	}
}
