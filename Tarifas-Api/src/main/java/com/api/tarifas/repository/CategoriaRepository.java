package com.api.tarifas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tarifas.domain.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long > {

}
