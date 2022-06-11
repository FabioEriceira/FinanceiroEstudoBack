package com.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
