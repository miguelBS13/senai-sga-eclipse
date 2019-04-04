package br.senai.rn.locadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		model.addAttribute("locadora",new Locadora());
		model.addAttribute("locadoras", service.BuscarTodos());
		return "index";
	}
	
	@PostMapping
	public String salvar(Locadora locadora) {
		service.Salvar(locadora);
		return "redirect:/locadora";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("locadora",service.Buscar(id));
		model.addAttribute("locadoras", service.BuscarTodos());		
		return "index";
	}
	
	@GetMapping("/remover/{id}")
	public String remover(@PathVariable Long id, Model model) {
		service.removerPorId(id);
		return "redirect:/locadora";
	}
}
