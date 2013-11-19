package br.com.atividadefisica.db;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GenericDAO<T> implements GenericDAOI<T> {


	@PersistenceContext(name = "atividadefisica")
	protected EntityManager em;

	public void inserir(T obj) {
		em.persist(obj);
	}

	public void update(T obj) {
		em.merge(obj);
	}

	public void remover(int id) {
		T obj = em.find(getTypeClass(), id);
		em.remove(obj);
	}

	public T getObject(long id) {
		return em.find(getTypeClass(), id);
	}

	public T getObject(int id) {
		return em.find(getTypeClass(), id);
	}

	public List<T> lista() {
		String sql = "SELECT c FROM  "
				+ getTypeClass().getName().replace("br.com.atividadefisica.model.", "") + " c";
		Query q = em.createQuery(sql);

		return  q.getResultList();
	}


	
	protected Class<T> getTypeClass() {
		return (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	protected List<T> buscaListaPorParametro(Map<String, Object> parameters) {
		String nome = getTypeClass().getName();
		StringBuilder sql = new StringBuilder();
		sql.append("from ").append(nome.replace("br.com.atividadefisica.model.", "") + " c").append(" where ");
		for (String string : parameters.keySet()) {
			sql.append(string + "= :" + string);
		}

		Query q = em.createQuery(sql.toString());
		for (String string : parameters.keySet()) {
			q.setParameter(string, parameters.get(string));
		}

		return q.getResultList();
	}
	
	protected T buscaObjectPorParametro(Map<String, Object> parameters) {
		String nome = getTypeClass().getName();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT c from ").append(nome.replace("br.com.atividadefisica.model.", "") + " c ").append(" where ");
		
		int i = 1;
		for (String string : parameters.keySet()) {
			sql.append("c."+string + "= :"+ string);
			
		if(i<parameters.size()){
			sql.append(" and "); 
			i++;
			}
		
		}	
		
		Query q = em.createQuery(sql.toString());
		for (String string : parameters.keySet()) {
			q.setParameter(string, parameters.get(string));
		}
		
			return  (T) q.getSingleResult();
		
		
		
	}
	
	/*protected T buscaObjectPorParametro(Map<String, Object> parameters) {
		String nome = getTypeClass().getName();
		StringBuilder sql = new StringBuilder();
		sql.append("from ").append(nome.replace("br.com.atividadefisica.model", "") + " c").append(" where ");
		for (String string : parameters.keySet()) {
			sql.append(string + "= :" + string);
		}

		Query q = em.createQuery(sql.toString());
		for (String string : parameters.keySet()) {
			q.setParameter(string, parameters.get(string));
		}

		return (T) q.getSingleResult();
	}*/
	
	

}