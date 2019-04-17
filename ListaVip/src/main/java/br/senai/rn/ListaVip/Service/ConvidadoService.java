package br.senai.rn.ListaVip.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.senai.rn.ListaVip.model.Convidado;
import br.senai.rn.ListaVip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;
	
	public void salvar(Convidado convidado) {
		if(Validate(convidado)) {			
			repository.save(convidado);
		}
	}
	
	public Convidado obter(Long id) {
		Optional<Convidado> convidadoBuscado= repository.findById(id);
		if(convidadoBuscado.isPresent()) {			
			return convidadoBuscado.get();
		}
		return new Convidado();
	}
	
	public List<Convidado> obterTodos(){
		return repository.findAll();
	}
	
	private Boolean Validate(Convidado convidado) {
		if(StringUtils.isEmpty(convidado.getNome())
				|| StringUtils.isEmpty(convidado.getFone())) {
			return false;
		}
		return true;
	}
	
	
}
