package br.com.atividadefisica.db;

import java.util.List;

import javax.ejb.Local;

import br.com.atividadefisica.model.Modalidade;

@Local
public interface ModalidadeDAOI extends GenericDAOI<Modalidade>{
	 List<Modalidade> buscaPorString(String string);
	 Modalidade buscaPorNomeModalida(String string);
}