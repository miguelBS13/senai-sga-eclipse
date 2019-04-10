package br.senai.rn.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.model.Filme;
import br.senai.rn.locadora.model.Locadora;
import br.senai.rn.locadora.services.LocadoraService;

@Controller
@RequestMapping("/filme")
public class FilmeController extends AbstractController<Filme> {
	
	@Autowired
	private LocadoraService categoriaService;
	
	@Override
	public String index(Model model) {
		List<Locadora> locadoras = categoriaService.obterTodos();
		model.addAttribute("locadoraLista", locadoras);
		return super.index(model);
	}
	
	@Override
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		List<Locadora> locadoras = categoriaService.obterTodos();
		model.addAttribute("locadoraLista", locadoras);
		return super.editar(id, model);
	}
}
