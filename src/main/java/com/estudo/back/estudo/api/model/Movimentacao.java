package com.estudo.back.estudo.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="tab_movimentacao")
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name= "data_hora")
	private LocalDateTime dataHora;
	
	private String descricao;
	private Double valor;
	
	@Column(name = "id_conta")
	private Integer idConta;
	
	@Enumerated(EnumType.STRING)
	private MovimentacaoTipo tipo;
}
