package com.estudo.back.estudo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.back.estudo.api.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista,  Integer> {

}
