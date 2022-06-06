package com.estudo.back.estudo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.back.estudo.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
