package com.estudo.back.estudo.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Embeddable
public class Conta {
	@Column(name = "conta_numero")
	private Long numero;
	
	@Column(name = "conta_saldo")
	private Double saldo;
	
	
}
