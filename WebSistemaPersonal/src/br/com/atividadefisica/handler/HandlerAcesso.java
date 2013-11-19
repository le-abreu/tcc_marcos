package br.com.atividadefisica.handler;

import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.atividadefisica.controller.Aluno;
import br.com.atividadefisica.controller.AlunoBeanRemote;
import br.com.atividadefisica.controller.AlunoBeanRemoteProxy;
import br.com.atividadefisica.controller.Personal;
import br.com.atividadefisica.controller.PersonalBeanRemote;
import br.com.atividadefisica.controller.PersonalBeanRemoteProxy;
import br.com.atividadefisica.controller.Pessoa;

@RequestScoped
@ManagedBean(name = "handlerAcesso")
public class HandlerAcesso {
	private Aluno aluno = new Aluno();
	private Personal personal = new Personal();

	private AlunoBeanRemote alunoBean;
	private PersonalBeanRemote personalBean;

	private String email, senhaSistema, acesso;

	public String acessoEmailSenha() {
		try {
			Pessoa pessoa = null;
			if (acesso.equals("aluno")) {
				alunoBean = new AlunoBeanRemoteProxy();
				Aluno aluno = alunoBean.loginAluno(email, senhaSistema);
				pessoa = aluno;
			} else {
				personalBean = new PersonalBeanRemoteProxy();
				Personal personal = personalBean.loginPersonal(email,senhaSistema);
				pessoa = personal;
			}
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", pessoa); 
			return "menu_" + acesso + ".xhtml";
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return "Falha";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenhaSistema() {
		return senhaSistema;
	}

	public void setSenhaSistema(String senhaSistema) {
		this.senhaSistema = senhaSistema;
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

}
