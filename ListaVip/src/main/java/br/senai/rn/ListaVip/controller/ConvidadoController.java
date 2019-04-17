package br.senai.rn.ListaVip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.rn.ListaVip.Service.ConvidadoService;

@Controller
@RequestMapping("/lista-vip")
public class ConvidadoController {

	@Autowired
	private ConvidadoService service;
	
	// to do
}
