package br.org.generation.VitrineVirtual.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.VitrineVirtual.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer>{
	
}
