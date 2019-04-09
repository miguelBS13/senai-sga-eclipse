package br.senai.rn.locadora.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senai.rn.locadora.model.Filme;

@Service
@Transactional
public class FilmeService extends AbstractService<Filme> {

}
