package br.senai.rn.locadora.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.rn.locadora.model.Categoria;
import br.senai.rn.locadora.services.CategoriaService;

@RestController
@RequestMapping("/locadora")
public class CategoriaRest {

	@Autowired
	private CategoriaService service;
	
	@GetMapping("/todos")
	public List<Categoria> obterTodos(){
		return service.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Categoria obter(@PathVariable Long id) {
		return service.obter(id);
	}
}
