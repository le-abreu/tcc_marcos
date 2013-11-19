package br.com.atividadefisica.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.Query;

import br.com.atividadefisica.model.Modalidade;

@Stateless(name = "ejb/modalidadedao")
public class ModalidadeDAO extends GenericDAO<Modalidade> implements ModalidadeDAOI {

	
	public List<Modalidade> buscaPorString(String string) {
		String nome = getTypeClass().getName();
		StringBuilder sql = new StringBuilder();
		sql.append("from ").append(nome.replace("br.com.atividadefisica.model.", "") + " c").append(" where c.nome like :nome");
		Query q = em.createQuery(sql.toString());
		q.setParameter("nome", string+"%");
		return q.getResultList();
	}

	public Modalidade buscaPorNomeModalida(String nome) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("nome", nome);
		return buscaObjectPorParametro(parameters);
	}
}
