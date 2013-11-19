package br.com.atividadefisica.controller;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.atividadefisica.db.ModalidadeDAOI;
import br.com.atividadefisica.model.Modalidade;

/**
 * Session Bean implementation class ModalidadeBean
 */
@Stateless
@LocalBean
@WebService
public class ModalidadeBean implements ModalidadeBeanRemote {

    /**
     * Default constructor. 
     */
    public ModalidadeBean() {
        // TODO Auto-generated constructor stub
    }

    public List<Modalidade> getModalidades(String query) {
    	ModalidadeDAOI modalidadeDAO = lookupModalidadeDAO();
		return modalidadeDAO.buscaPorString(query);
		
	}
    
    protected static ModalidadeDAOI lookupModalidadeDAO() {
		ModalidadeDAOI modalidadeDAO = null;
		try {
			modalidadeDAO = (ModalidadeDAOI) new InitialContext().lookup("ejb/modalidadedao/local");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modalidadeDAO;
	}

}
