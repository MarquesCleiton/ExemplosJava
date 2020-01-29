package br.org.generation.VitrineVirtual.services;

import java.util.List;

import br.org.generation.VitrineVirtual.model.Produto;

public interface IProdutoService {
	public List<Produto> recuperaTudo();
	public Produto recuperaPeloId(int id);
}
