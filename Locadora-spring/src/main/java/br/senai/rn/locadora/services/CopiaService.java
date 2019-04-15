package br.senai.rn.locadora.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senai.rn.locadora.model.Copia;

@Service
@Transactional
public class CopiaService extends AbstractService<Copia>{

}
