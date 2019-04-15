package com.exemple.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.algamoneyapi.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

