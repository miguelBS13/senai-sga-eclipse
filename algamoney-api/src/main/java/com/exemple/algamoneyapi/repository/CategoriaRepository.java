package com.exemple.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.algamoneyapi.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}