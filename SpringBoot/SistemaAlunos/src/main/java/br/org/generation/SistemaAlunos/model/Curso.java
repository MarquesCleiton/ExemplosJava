package br.org.generation.SistemaAlunos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="tblcurso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCurso")
	private int idCurso;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "detalhes", length = 200)
	private String detalhes;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	@JsonIgnoreProperties("curso")
	private List<Aluno> alunos;
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	
	
}
