package com.api.tarifas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tarifas.domain.Tarifa;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

}
