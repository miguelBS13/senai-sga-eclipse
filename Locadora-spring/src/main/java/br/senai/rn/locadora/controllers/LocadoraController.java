package br.senai.rn.locadora.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.locadora.model.Locadora;

@Controller
@RequestMapping("/locadora")
public class LocadoraController extends AbstractController<Locadora> {}
	
