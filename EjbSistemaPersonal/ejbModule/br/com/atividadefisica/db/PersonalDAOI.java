package br.com.atividadefisica.db;

import javax.ejb.Local;

import br.com.atividadefisica.model.Personal;

@Local
public interface PersonalDAOI extends GenericDAOI<Personal>{

	Personal getEmailSenha(String email, String senha);

}