package br.senai.rn.locadora.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.rn.locadora.model.Locadora;
import br.senai.rn.locadora.services.LocadoraService;

@RestController
@RequestMapping("/ws/categoria")
public class LocadoraRest {

	@Autowired
	private LocadoraService service;
	
	@GetMapping
	public List<Locadora> buscarTodos(){
		return service.BuscarTodos();
	}
}

