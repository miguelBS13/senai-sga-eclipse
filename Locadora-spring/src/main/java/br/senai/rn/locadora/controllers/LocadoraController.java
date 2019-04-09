package br.senai.rn.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.model.Locadora;
import br.senai.rn.locadora.services.LocadoraService;

@Controller
@RequestMapping("/locadora")
public class LocadoraController {

	@Autowired
	private LocadoraService service;
	
	@GetMapping
	public String index(Model model) {
		Locadora locadora = new Locadora();
		List<Locadora> locadoras = service.obterTodos();
		model.addAttribute("locadora", locadora);
		model.addAttribute("locadoras", locadoras);
		return "categoria/index";
	}
	
	@PostMapping
	public String salvar(Locadora locadora) {
		service.salvar(locadora);
		return "redirect:/locadora";
	}
	
	
	
}
