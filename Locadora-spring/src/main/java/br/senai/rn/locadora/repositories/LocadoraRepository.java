package br.senai.rn.locadora.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.senai.rn.locadora.model.Locadora;

@Repository
public interface LocadoraRepository extends JpaRepository<Locadora, Long> {

	@Override
	@Query("UPDATE Loc c SET c.ativo=false WHERE c=:locadora")
	void delete(@Param("locadora") Locadora locadora);
	
	@Override
	@Transactional
	@Query("UPDATE Loc c SET c.ativo=false WHERE c.id=:id")
	void deleteById(@Param("id") Long id);	
	
	@Override
	@Query("SELECT c FROM Loc c WHERE c.ativo=true")
	List<Locadora> findAll();
	
	@Override
	@Query("SELECT c FROM Loc c WHERE c.ativo=true AND c.id=:id")
	Optional<Locadora> findById(@Param("id") Long id);

}
