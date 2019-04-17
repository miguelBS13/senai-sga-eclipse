package br.senai.rn.ListaVip.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.rn.ListaVip.Service.ConvidadoService;

@RestController
@RequestMapping("/lista-vop/ws")
public class ConvidadoResource {

	@Autowired
	private ConvidadoService service;
	
	//to do
	
}
