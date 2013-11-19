package br.com.atividadefisica.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Personal extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	private String graduacao;

	private int numCref;
	
	@Column
	private String curricullum;

	@ManyToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE) 
	private List<Modalidade> modalidades;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "personal")
	@LazyCollection(LazyCollectionOption.FALSE) 
	private List<Atividade> atividades;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "personal")
	@LazyCollection(LazyCollectionOption.FALSE) 
	private List<Avaliacao> avalicoes;


	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	private Telefone telefone;

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public int getNumCref() {
		return numCref;
	}

	public void setNumCref(int numCref) {
		this.numCref = numCref;
	}

	public String getCurricullum() {
		return curricullum;
	}

	public void setCurricullum(String curricullum) {
		this.curricullum = curricullum;
	}

	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public List<Avaliacao> getAvalicoes() {
		return avalicoes;
	}

	public void setAvalicoes(List<Avaliacao> avalicoes) {
		this.avalicoes = avalicoes;
	}
	
	
	
	
	
	
	
	

}
