package br.com.atividadefisica.controller;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

import br.com.atividadefisica.model.Modalidade;

@Remote
@WebService
public interface ModalidadeBeanRemote {

	List<Modalidade> getModalidades(String query);
}
