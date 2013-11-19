package br.com.atividadefisica.db;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.com.atividadefisica.model.Aluno;

@Stateless(name = "ejb/alunodao")
public class AlunoDAO extends GenericDAO<Aluno> implements AlunoDAOI {

	@Override
	public Aluno getEmailSenha(String email, String senha) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("senha", senha);
		parameters.put("email", email);
		Aluno aluno = buscaObjectPorParametro(parameters);
		return aluno;
	}

}
