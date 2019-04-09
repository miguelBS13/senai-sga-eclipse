package br.senai.rn.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.model.Filme;
import br.senai.rn.locadora.services.FilmeService;

@Controller
@RequestMapping("/filme")
public class FilmeController {

	@Autowired
	private FilmeService service;
	
	@GetMapping
	public String index(Model model) {
		Filme filme = new Filme();
		List<Filme> filmes = service.obterTodos();
		model.addAttribute("filme", filme);
		model.addAttribute("filmes", filmes);
		return "filme/index2";
	}
	
	@PostMapping
	public String salvar(Filme filme) {
		service.salvar(filme);
		return "redirect:/filme";
	}
	
	@GetMapping("/remover/{id}")
	public String remover(@PathVariable Long id, Model model) {
		service.remover(id);
		return "redirect:/filme";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("filme",service.obter(id));
		model.addAttribute("filmes", service.obterTodos());		
		return "filme/index2";
	}
}
