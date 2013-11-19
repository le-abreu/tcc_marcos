package br.com.atividadefisica.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Aluno extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@OneToOne(cascade = CascadeType.ALL)	
	private Telefone telefone; 
	
	@OneToOne(cascade = CascadeType.ALL)	
	private Endereco endereco;	
	

	@OneToOne(cascade = CascadeType.ALL)	
	private Anamnese anamnese;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
	@LazyCollection(LazyCollectionOption.FALSE) 
	private List<Avaliacao> listaAvaliacao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "aluno")
	@LazyCollection(LazyCollectionOption.FALSE) 
	private List<Atividade> atividades;



	public Anamnese getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(Anamnese anamnese) {
		this.anamnese = anamnese;
	}

	public List<Avaliacao> getListaAvaliacao() {
		return listaAvaliacao;
	}

	public void setListaAvaliacao(List<Avaliacao> listaAvaliacao) {
		this.listaAvaliacao = listaAvaliacao;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
