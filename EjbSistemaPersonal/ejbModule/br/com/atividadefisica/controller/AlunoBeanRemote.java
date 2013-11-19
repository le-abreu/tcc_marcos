package br.com.atividadefisica.controller;

import javax.ejb.Remote;
import javax.jws.WebService;

import br.com.atividadefisica.model.Aluno;

@Remote
@WebService
public interface AlunoBeanRemote {

	boolean salvarAluno(Aluno aluno);
	Aluno loginAluno(String email, String senha);
	
}
