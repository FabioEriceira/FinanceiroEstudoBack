package com.estudo.back.estudo.api.dto;

import com.estudo.back.estudo.api.model.MovimentacaoTipo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NovaMovimentacao {
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	private Integer idConta;
	
}
