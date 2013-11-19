package br.com.atividadefisica.db;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.com.atividadefisica.model.Personal;

@Stateless(name = "ejb/personaldao")
public class PersonalDAO extends GenericDAO<Personal> implements PersonalDAOI {

	@Override
	public Personal getEmailSenha(String email, String senha) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("senha", senha);
		parameters.put("email", email);
		
		return buscaObjectPorParametro(parameters);
		
	}

}
