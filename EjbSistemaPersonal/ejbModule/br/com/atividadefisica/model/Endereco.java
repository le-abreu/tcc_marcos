package br.com.atividadefisica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/*public enum RegiaoEnum{
		NORTE("Norte"),
		SUL("Sul"),
		LESTE("Leste"),
		OESTE("Oeste");
		
		private String regiao;
		private RegiaoEnum(String regiao){
			this.regiao = regiao;
		}
		@Override
		public String toString() {
			return regiao;
		}
	}*/

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String cep;
	
	private String uf;
	
	private String logradouro;
	
	private String numero;
	
	private String Bairro;
	
	private String Estado;
	
	private String cidade;

	
	//private RegiaoEnum regiao;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/*public RegiaoEnum getRegiao() {
		return regiao;
	}

	public void setRegiao(RegiaoEnum regiao) {
		this.regiao = regiao;
	}*/

}
