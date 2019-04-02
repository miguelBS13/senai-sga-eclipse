package br.senai.rn.agenda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.agenda.model.Contato;
import br.senai.rn.agenda.services.ContatoService;

@Controller
@RequestMapping("/")
public class ContatoController {
	
	@Autowired
	private ContatoService service;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("contato",new Contato());
		model.addAttribute("contatos", service.BuscarTodos());
		return "index";
	}
	
	@PostMapping
	public String salvar(Contato contato) {
		service.Salvar(contato);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("contato",service.Buscar(id));
		model.addAttribute("contatos", service.BuscarTodos());
		return "index";
	}
	
	@PostMapping("/editar/{id}")
	public String save(@PathVariable Long id, Contato contato) {
		service.Salvar(contato);
		return "redirect:/";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id, Contato contato) {
		service.remover(contato);
		return "redirect:/";
	}
	
}
