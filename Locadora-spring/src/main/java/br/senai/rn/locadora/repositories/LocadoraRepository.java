package br.senai.rn.locadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senai.rn.locadora.model.Locadora;

@Repository
public interface LocadoraRepository extends JpaRepository<Locadora, Long> {

}
