package br.senai.rn.ListaVip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senai.rn.ListaVip.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {

}
