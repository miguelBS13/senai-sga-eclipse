package br.senai.rn.locadora.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.rn.locadora.model.Locadora;
import br.senai.rn.locadora.services.LocadoraService;

@RestController
@RequestMapping("/locadora")
public class CategoriaRest {

	@Autowired
	private LocadoraService service;
	
	@GetMapping("/todos")
	public List<Locadora> obterTodos(){
		return service.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Locadora obter(@PathVariable Long id) {
		return service.obter(id);
	}
}
