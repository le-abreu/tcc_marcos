package br.com.atividadefisica.controller;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.atividadefisica.model.Personal;

@Remote
@WebService
public interface PersonalBeanRemote {

	@WebMethod
	public boolean salvarPersonal(Personal personal);
	
	@WebMethod
	Personal loginPersonal(String email, String senha);
}
