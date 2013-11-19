package br.com.atividadefisica.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Avaliacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Temporal(TemporalType.DATE)
	private Calendar dataAvaliacao;
	
	private float pesoCorporal;
	
	private float altura;
	
	private float peitoral;
	
	private float bracoD;
	
	private float bracoE;
	
	private float anteBracoD;
	
	private float anteBracoE;
	
	private float coxaD;
	
	private float coxaE;
	
	private float pernaD;
	
	private float pernaE;
	
	private float cintura;
	
	private float abdomen;
	
	private float quadril;
	
	private float dobCutaneas;
	
	private float axiliaMedia;
	
	private float peitoralCutanea;
	
	private float subscapular;
	
	private float tricipital;
	
	private float supraIliaca;
	
	private float abdominal;
	
	private float coxa;
	
	private float freqCardMax;
	
	private float bpmMax;
	
	private float fcIniciais;
	
	private float bpmInic;
	
	private float fcAlcancada;
	
	private float bpmAlc;
	
	private float paRepouso;
	
	private float percMaxPAesforco;
	
	private float vo2Max;
	
	private float imc;
	
	private float batPorMinuto;
	
	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Personal personal;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Calendar getDataAvaliacao() {
		return dataAvaliacao;
	}

	public void setDataAvaliacao(Calendar dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}

	public float getPesoCorporal() {
		return pesoCorporal;
	}

	public void setPesoCorporal(float pesoCorporal) {
		this.pesoCorporal = pesoCorporal;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(float peitoral) {
		this.peitoral = peitoral;
	}

	public float getBracoD() {
		return bracoD;
	}

	public void setBracoD(float bracoD) {
		this.bracoD = bracoD;
	}

	public float getBracoE() {
		return bracoE;
	}

	public void setBracoE(float bracoE) {
		this.bracoE = bracoE;
	}

	public float getAnteBracoD() {
		return anteBracoD;
	}

	public void setAnteBracoD(float anteBracoD) {
		this.anteBracoD = anteBracoD;
	}

	public float getAnteBracoE() {
		return anteBracoE;
	}

	public void setAnteBracoE(float anteBracoE) {
		this.anteBracoE = anteBracoE;
	}

	public float getCoxaD() {
		return coxaD;
	}

	public void setCoxaD(float coxaD) {
		this.coxaD = coxaD;
	}

	public float getCoxaE() {
		return coxaE;
	}

	public void setCoxaE(float coxaE) {
		this.coxaE = coxaE;
	}

	public float getPernaD() {
		return pernaD;
	}

	public void setPernaD(float pernaD) {
		this.pernaD = pernaD;
	}

	public float getPernaE() {
		return pernaE;
	}

	public void setPernaE(float pernaE) {
		this.pernaE = pernaE;
	}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(float cintura) {
		this.cintura = cintura;
	}

	public float getAbdomen() {
		return abdomen;
	}

	public void setAbdomen(float abdomen) {
		this.abdomen = abdomen;
	}

	public float getQuadril() {
		return quadril;
	}

	public void setQuadril(float quadril) {
		this.quadril = quadril;
	}

	public float getDobCutaneas() {
		return dobCutaneas;
	}

	public void setDobCutaneas(float dobCutaneas) {
		this.dobCutaneas = dobCutaneas;
	}

	public float getAxiliaMedia() {
		return axiliaMedia;
	}

	public void setAxiliaMedia(float axiliaMedia) {
		this.axiliaMedia = axiliaMedia;
	}

	public float getPeitoralCutanea() {
		return peitoralCutanea;
	}

	public void setPeitoralCutanea(float peitoralCutanea) {
		this.peitoralCutanea = peitoralCutanea;
	}

	public float getSubscapular() {
		return subscapular;
	}

	public void setSubscapular(float subscapular) {
		this.subscapular = subscapular;
	}

	public float getTricipital() {
		return tricipital;
	}

	public void setTricipital(float tricipital) {
		this.tricipital = tricipital;
	}

	public float getSupraIliaca() {
		return supraIliaca;
	}

	public void setSupraIliaca(float supraIliaca) {
		this.supraIliaca = supraIliaca;
	}

	public float getAbdominal() {
		return abdominal;
	}

	public void setAbdominal(float abdominal) {
		this.abdominal = abdominal;
	}

	public float getCoxa() {
		return coxa;
	}

	public void setCoxa(float coxa) {
		this.coxa = coxa;
	}

	public float getFreqCardMax() {
		return freqCardMax;
	}

	public void setFreqCardMax(float freqCardMax) {
		this.freqCardMax = freqCardMax;
	}

	public float getBpmMax() {
		return bpmMax;
	}

	public void setBpmMax(float bpmMax) {
		this.bpmMax = bpmMax;
	}

	public float getFcIniciais() {
		return fcIniciais;
	}

	public void setFcIniciais(float fcIniciais) {
		this.fcIniciais = fcIniciais;
	}

	public float getBpmInic() {
		return bpmInic;
	}

	public void setBpmInic(float bpmInic) {
		this.bpmInic = bpmInic;
	}

	public float getFcAlcancada() {
		return fcAlcancada;
	}

	public void setFcAlcancada(float fcAlcancada) {
		this.fcAlcancada = fcAlcancada;
	}

	public float getBpmAlc() {
		return bpmAlc;
	}

	public void setBpmAlc(float bpmAlc) {
		this.bpmAlc = bpmAlc;
	}

	public float getPaRepouso() {
		return paRepouso;
	}

	public void setPaRepouso(float paRepouso) {
		this.paRepouso = paRepouso;
	}

	public float getPercMaxPAesforco() {
		return percMaxPAesforco;
	}

	public void setPercMaxPAesforco(float percMaxPAesforco) {
		this.percMaxPAesforco = percMaxPAesforco;
	}

	public float getVo2Max() {
		return vo2Max;
	}

	public void setVo2Max(float vo2Max) {
		this.vo2Max = vo2Max;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public float getBatPorMinuto() {
		return batPorMinuto;
	}

	public void setBatPorMinuto(float batPorMinuto) {
		this.batPorMinuto = batPorMinuto;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	
	

}
