package br.com.atividadefisica.handler;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import br.com.atividadefisica.controller.Endereco;
import br.com.atividadefisica.controller.Modalidade;
import br.com.atividadefisica.controller.ModalidadeBeanRemote;
import br.com.atividadefisica.controller.ModalidadeBeanRemoteProxy;
import br.com.atividadefisica.controller.Personal;
import br.com.atividadefisica.controller.PersonalBeanRemote;
import br.com.atividadefisica.controller.PersonalBeanRemoteProxy;
import br.com.atividadefisica.controller.Telefone;

@ViewScoped
@ManagedBean(name = "handlerPersonal")
public class HandlerPersonal {
		
	private Personal personal = new Personal();
	private String modalidade;
	private List<Modalidade> modalidades = new ArrayList<Modalidade>();
	private List<Modalidade> modalidadesAuxiliar;
	
	private Telefone telefone = new Telefone();
	private Endereco endereco = new Endereco();
	
	
	private PersonalBeanRemote personalBean = new PersonalBeanRemoteProxy();
	private ModalidadeBeanRemote modalidadeBean = new ModalidadeBeanRemoteProxy();

	{
		personal= (Personal)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario"); 
		
		if(personal == null){
			personal = new Personal();
			personal.setEndereco(this.endereco);
			personal.setTelefone(this.telefone);
		}
	}
	
	public String salvarPersonal(){
		System.out.println("Personal Handler:"+personal.getNome());
		try {
			personal.setModalidades((Modalidade[]) modalidades.toArray(new Modalidade[0]));
			personalBean.salvarPersonal(personal);
			return "Sucesso";
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return "Falha";
	}

	public void salvarModalidade(){
		
		Modalidade modalidade = null;
		if(modalidadesAuxiliar != null){
			for (Modalidade m : modalidadesAuxiliar) {
				if(m.getNome().equals(getModalidade())){
					modalidade = m;
				}
			}
		}
		
		if(modalidade == null){
			modalidade = new Modalidade();
			modalidade.setNome(getModalidade());
		}
		modalidades.add(modalidade);
		this.modalidade = "";
//		return "Falha";
	}

	public void handleSelect(SelectEvent event) {  
	    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected:" + event.getObject().toString(), null);  
	    FacesContext.getCurrentInstance().addMessage(null, message);  
	}  
	
	public List<String> complete(String query) {  
        List<String> results = new ArrayList<String>();  
        try {
        	Modalidade[] list = modalidadeBean.getModalidades(query);
        	if(list != null){
        		modalidadesAuxiliar = Arrays.asList(list);
	        	for(Modalidade modalidade : modalidadeBean.getModalidades(query)) {  
				    results.add(modalidade.getNome());  
				}
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}  
          
        return results;  
    }

	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}  
	
	public Personal getPersonal() {
		return personal;
	}


	public void setPersonal(Personal personal) {
		this.personal = personal;
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

	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	/*public List<SexoEnum> getSexoEnum(){
	return Arrays.asList(
			SexoEnum.FEMININO, 
			SexoEnum.MASCULINO);
}*/



}
