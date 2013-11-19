package br.com.atividadefisica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Anamnese implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	private Aluno aluno;
	
	private String cirurgia;
	
	private String doenca;
	
	private String medicamento;
	
	private String lesao;
	
	private String alergia;
	
	private String tmpPeriodo;
	
	private String manifestacoes;
	
	private String cardiopatia;
	
	private String hipertensao;
	
	private String fumante;
	
	private String tempoFumo;
	
	private String quanCigarro;
	
	private String exFumante;
	
	private String quatTempFumou;
	
	private String quatTempParou;
	
	private String freqBeber;
	
	private String dieta;
	
	private String pratAtividade;
	
	private String quaisAtividades;
	
	private String praticouAtiv;
	
	private String quantoTempPraticou;
	
	private String tempoInativo;
	
	private String naoPratAtividade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(String cirurgia) {
		this.cirurgia = cirurgia;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getLesao() {
		return lesao;
	}

	public void setLesao(String lesao) {
		this.lesao = lesao;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getTmpPeriodo() {
		return tmpPeriodo;
	}

	public void setTmpPeriodo(String tmpPeriodo) {
		this.tmpPeriodo = tmpPeriodo;
	}

	public String getManifestacoes() {
		return manifestacoes;
	}

	public void setManifestacoes(String manifestacoes) {
		this.manifestacoes = manifestacoes;
	}

	public String getCardiopatia() {
		return cardiopatia;
	}

	public void setCardiopatia(String cardiopatia) {
		this.cardiopatia = cardiopatia;
	}

	public String getHipertensao() {
		return hipertensao;
	}

	public void setHipertensao(String hipertensao) {
		this.hipertensao = hipertensao;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

	public String getTempoFumo() {
		return tempoFumo;
	}

	public void setTempoFumo(String tempoFumo) {
		this.tempoFumo = tempoFumo;
	}

	public String getQuanCigarro() {
		return quanCigarro;
	}

	public void setQuanCigarro(String quanCigarro) {
		this.quanCigarro = quanCigarro;
	}

	public String getExFumante() {
		return exFumante;
	}

	public void setExFumante(String exFumante) {
		this.exFumante = exFumante;
	}

	public String getQuatTempFumou() {
		return quatTempFumou;
	}

	public void setQuatTempFumou(String quatTempFumou) {
		this.quatTempFumou = quatTempFumou;
	}

	public String getQuatTempParou() {
		return quatTempParou;
	}

	public void setQuatTempParou(String quatTempParou) {
		this.quatTempParou = quatTempParou;
	}

	public String getFreqBeber() {
		return freqBeber;
	}

	public void setFreqBeber(String freqBeber) {
		this.freqBeber = freqBeber;
	}

	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public String getPratAtividade() {
		return pratAtividade;
	}

	public void setPratAtividade(String pratAtividade) {
		this.pratAtividade = pratAtividade;
	}

	public String getQuaisAtividades() {
		return quaisAtividades;
	}

	public void setQuaisAtividades(String quaisAtividades) {
		this.quaisAtividades = quaisAtividades;
	}

	public String getPraticouAtiv() {
		return praticouAtiv;
	}

	public void setPraticouAtiv(String praticouAtiv) {
		this.praticouAtiv = praticouAtiv;
	}

	public String getQuantoTempPraticou() {
		return quantoTempPraticou;
	}

	public void setQuantoTempPraticou(String quantoTempPraticou) {
		this.quantoTempPraticou = quantoTempPraticou;
	}

	public String getTempoInativo() {
		return tempoInativo;
	}

	public void setTempoInativo(String tempoInativo) {
		this.tempoInativo = tempoInativo;
	}

	public String getNaoPratAtividade() {
		return naoPratAtividade;
	}

	public void setNaoPratAtividade(String naoPratAtividade) {
		this.naoPratAtividade = naoPratAtividade;
	}

}
