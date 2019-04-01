package br.senai.rn.agenda.services;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.model.Email;
import br.senai.rn.agenda.repositories.EmailDAO;

public class EmailServices {

	private EmailDAO dao = new EmailDAO();

	public Boolean salvar(Email email) {
		if(ObjectUtils.allNotNull(email) || StringUtils.isNotEmpty(email.getEmail())) {			
			dao.salvar(email);
			return true;
		}
		return false;
	}

	public Boolean excluir(Email email) {
		if(ObjectUtils.allNotNull(email)) {			
			dao.excluir(email);
			return true;
		}
		return false;
	}

	public Email buscarPorId(Long id) {
		if(ObjectUtils.allNotNull(id)) {	
		return dao.buscarPorId(id);		
		}
		return null;
	}

	public List<Email> buscarTodos() {
		return dao.buscarTodos();
	}
	
	
	
}
