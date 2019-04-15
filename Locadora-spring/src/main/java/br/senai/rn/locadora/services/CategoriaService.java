package br.senai.rn.locadora.services;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import br.senai.rn.locadora.model.Categoria;

@Service
@Transactional
public class CategoriaService extends AbstractService<Categoria> {}
