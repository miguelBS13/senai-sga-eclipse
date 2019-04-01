package br.senai.rn.agenda.services;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.model.Contato;
import br.senai.rn.agenda.repositories.ContatoRepository;

public class ContatoServices {

	private ContatoRepository dao = new ContatoRepository();

	public Boolean salvar(Contato contato) {
		if(ObjectUtils.allNotNull(contato) || StringUtils.isNotEmpty(contato.getNome())) {
			dao.salvar(contato);
			return true;
		}
		return false;
	}

	public Boolean excluir(Contato contato) {
		if(ObjectUtils.allNotNull(contato)) {			
			dao.excluir(contato);
			return true;
		}
		return false;
	}

	public Contato buscarPorId(Long id) {
		if(ObjectUtils.allNotNull(id)) {	
		return dao.buscarPorId(id);
		}
		return null;
	}

	public List<Contato> buscarTodos() {
		return dao.buscarTodos();
	}
	
	
	
	
}
