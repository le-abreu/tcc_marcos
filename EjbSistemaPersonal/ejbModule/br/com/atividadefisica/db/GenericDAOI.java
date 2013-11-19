package br.com.atividadefisica.db;

import java.util.List;

import javax.ejb.Local;

@Local
public interface GenericDAOI<T> {
	public void inserir(T obj);
	public void update(T obj);
	public void remover(int id);
	List<T> lista();
	T getObject(long id);
	T getObject(int id);
}