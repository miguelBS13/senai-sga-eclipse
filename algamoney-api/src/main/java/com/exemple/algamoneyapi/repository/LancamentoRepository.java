package com.exemple.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.algamoneyapi.models.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}
