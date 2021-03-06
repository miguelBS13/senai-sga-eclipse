package com.exemple.algamoneyapi.controllers;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

 import com.exemple.algamoneyapi.models.Lancamento;
import com.exemple.algamoneyapi.repository.LancamentoRepository;


	@RestController
	@RequestMapping("/lancamentos")
	public class LancamentoController {

		@Autowired
		private LancamentoRepository lancamentoRepository;
		
		@GetMapping
		public List<Lancamento> listar() {
			return lancamentoRepository.findAll();
		}
		
		@GetMapping("/{codigo}")
		public ResponseEntity<Lancamento> buscarPeloCodigo(@PathVariable Long codigo) {
			Lancamento lancamento = lancamentoRepository.findById(codigo).get();
			return lancamento != null ? ResponseEntity.ok(lancamento) : ResponseEntity.notFound().build();
		}
}
