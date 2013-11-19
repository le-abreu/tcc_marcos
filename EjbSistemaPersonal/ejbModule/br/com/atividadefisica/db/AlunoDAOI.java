package br.com.atividadefisica.db;

import javax.ejb.Local;

import br.com.atividadefisica.model.Aluno;

@Local
public interface AlunoDAOI extends GenericDAOI<Aluno>{
	
	Aluno getEmailSenha(String email, String senha);

}