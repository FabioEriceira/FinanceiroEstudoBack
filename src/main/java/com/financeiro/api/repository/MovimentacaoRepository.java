package com.financeiro.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financeiro.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{
	
	public List<Movimentacao>findByIdConta(Integer idConta);
	

}
