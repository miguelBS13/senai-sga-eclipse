package br.senai.rn.locadora.services;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senai.rn.locadora.model.Locadora;

@Service
@Transactional
public class LocadoraService extends AbstractService<Locadora> {}
