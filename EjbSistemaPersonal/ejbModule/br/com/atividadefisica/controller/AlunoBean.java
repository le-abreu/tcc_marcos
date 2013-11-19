package br.com.atividadefisica.controller;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.atividadefisica.db.AlunoDAOI;
import br.com.atividadefisica.model.Aluno;

/**
 * http://localhost:9500/SistemaPersonalTrainer/AlunoBean?wsdl
 * Session Bean implementation class AlunoBean
 */
@Stateless
@LocalBean
@WebService
public class AlunoBean implements AlunoBeanRemote {

	@Override
	public boolean salvarAluno(Aluno aluno) {
		System.out.println("AlunoBean: "+aluno.getNome());		
		AlunoDAOI alunoDAO = lookupAlunoDAO();
		alunoDAO.update(aluno);
		return true;
	}

	

	@Override
	public Aluno loginAluno(String email, String senha) {
		AlunoDAOI alunoDAO = lookupAlunoDAO();
		return alunoDAO.getEmailSenha(email, senha);
	}
	
	// Metodo Auxiliar lookup
	private AlunoDAOI lookupAlunoDAO() {
		AlunoDAOI alunoDAO = null;
		try {
			alunoDAO = (AlunoDAOI) new InitialContext().lookup("ejb/alunodao/local");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alunoDAO;
	}

    
}
