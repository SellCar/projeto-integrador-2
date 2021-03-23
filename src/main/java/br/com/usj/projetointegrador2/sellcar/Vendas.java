package br.com.usj.projetointegrador2.sellcar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nomecliente;
    String nomeveiculo;
    String valororiginal;
    String valorfinal;
    String formaspagamento;
}