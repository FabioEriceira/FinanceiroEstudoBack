package com.financeiro.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financeiro.api.dto.NovaMovimentacao;
import com.financeiro.api.dto.NovoCorrentista;
import com.financeiro.api.model.Movimentacao;
import com.financeiro.api.repository.MovimentacaoRepository;
import com.financeiro.api.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save (@ RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
		
	}
	
}
