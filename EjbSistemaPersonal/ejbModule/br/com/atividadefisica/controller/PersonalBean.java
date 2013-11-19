package br.com.atividadefisica.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.atividadefisica.db.ModalidadeDAOI;
import br.com.atividadefisica.db.PersonalDAOI;
import br.com.atividadefisica.model.Modalidade;
import br.com.atividadefisica.model.Personal;

/**
 * Session Bean implementation class PersonalBean
 */
@Stateless
@LocalBean
@WebService
public class PersonalBean implements PersonalBeanRemote {

    /**
     * Default constructor. 
     */
    public PersonalBean() {
    }

	@Override
	@WebMethod
	public boolean salvarPersonal(Personal personal) {
		System.out.println("PersonalBean: "+personal.getNome());		
		PersonalDAOI personalDAO = lookupPersonalDAO();
		ModalidadeDAOI modalidadeDAO = new ModalidadeBean().lookupModalidadeDAO();
		
		List<Modalidade> modalidades = new ArrayList<Modalidade>();
		if(personal.getModalidades() != null){
			for (Modalidade modalidade : personal.getModalidades()) {
				if(modalidade.getId() != 0){
					modalidade = modalidadeDAO.getObject(modalidade.getId());
				}
				modalidades.add (modalidade);
			}
			
			personal.setModalidades(modalidades);
		}
		
		personalDAO.update(personal);
		return true;
	}

	
	@Override
	public Personal loginPersonal(String email, String senha) {
		PersonalDAOI personalDAO = lookupPersonalDAO();
		return personalDAO.getEmailSenha(email, senha);
	}
	
	private PersonalDAOI lookupPersonalDAO() {
		PersonalDAOI personalDAO = null;
		try {
			personalDAO = (PersonalDAOI) new InitialContext().lookup("ejb/personaldao/local");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personalDAO;
	}
	

}
