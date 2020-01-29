package br.org.generation.VitrineVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.VitrineVirtual.dao.ProdutoRepo;
import br.org.generation.VitrineVirtual.model.Produto;

@Component
public class ProdutoServiceImpl implements IProdutoService{

	@Autowired                // declaramos a interface do DAO que criamos
	private ProdutoRepo repo; // e a declaração AutoWired busca uma implementação dentro do JPA
	@Override
	public List<Produto> recuperaTudo() {
		// isso corresponde a um 
		// select * from tblproduto
		// inner join tbldepartamneto
		// on tblproduto.departamento_id = departamento.id
		
		return (List<Produto>) repo.findAll();
	}

	@Override
	public Produto recuperaPeloId(int id) {
		//return repo.findById(id).orElse(new Produto());
		return repo.findById(id).get();
	}
}
