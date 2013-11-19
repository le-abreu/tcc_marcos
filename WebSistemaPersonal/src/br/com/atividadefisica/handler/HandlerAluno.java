package br.com.atividadefisica.handler;

import java.rmi.RemoteException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.atividadefisica.controller.Aluno;
import br.com.atividadefisica.controller.AlunoBeanRemote;
import br.com.atividadefisica.controller.AlunoBeanRemoteProxy;
import br.com.atividadefisica.controller.Endereco;
import br.com.atividadefisica.controller.Telefone;

@RequestScoped
@ManagedBean(name = "handlerAluno")
public class HandlerAluno {
	private Aluno aluno = new Aluno();
	private Telefone telefone = new Telefone();
	private Endereco endereco = new Endereco();
	
	
	private AlunoBeanRemote alunoBean = new AlunoBeanRemoteProxy();

	{
		aluno.setEndereco(this.endereco);
		aluno.setTelefone(this.telefone);
	}
	
	public String salvaAluno(){
		System.out.println("Aluno Handler:"+aluno.getNome());
		try {
			
			alunoBean.salvarAluno(aluno);
			return "Sucesso";
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
	
	/*public List<SexoEnum> getSexoEnum(){
		return Arrays.asList(
				SexoEnum.FEMININO, 
				SexoEnum.MASCULINO);
	}*/

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
