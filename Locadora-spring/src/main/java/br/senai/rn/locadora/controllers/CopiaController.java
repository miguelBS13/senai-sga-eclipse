package br.senai.rn.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.model.Copia;
import br.senai.rn.locadora.model.Filme;
import br.senai.rn.locadora.services.FilmeService;

@Controller
@RequestMapping("/copia")
public class CopiaController extends AbstractController<Copia> {
	
	@Autowired
	private FilmeService filmeService;

	@Override
	public String index(Model model) {
		List<Filme> filmes = filmeService.obterTodos();
		model.addAttribute("filmeLista", filmes);
		return super.index(model);
	}
	
	@Override
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		List<Filme> filmes = filmeService.obterTodos();
		model.addAttribute("filmeLista", filmes);
		return super.editar(id, model);
	}
}
