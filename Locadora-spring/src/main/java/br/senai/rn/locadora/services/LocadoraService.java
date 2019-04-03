package br.senai.rn.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.rn.locadora.model.Locadora;
import br.senai.rn.locadora.repositories.LocadoraRepository;

@Service
public class LocadoraService {

	@Autowired
	private LocadoraRepository repository;

	public void Salvar(Locadora locadora) {
		repository.save(locadora);
	}

	public List<Locadora> BuscarTodos() {
		return repository.findAll();
	}
	
	public Locadora Buscar(Long id) {
		return repository.findById(id).get();
	}

	public void remover(Locadora locadora) {
		repository.delete(locadora);
	}

	public void removerPorId(Long id) {
		repository.deleteById(id);
	}
}
