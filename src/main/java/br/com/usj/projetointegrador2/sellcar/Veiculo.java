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

public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String fabricante;
    String nomeveiculo;
    String anofabricacao;
    String anomodelo;
    String placa;
    String renavan;
    String chassi;
    Boolean multimidia;
    Boolean travaeletrica;
    Boolean vidroeletrico;
    Boolean arcondicionado;
    Boolean direcaohid;
    Boolean direcaoeletrica;
    Boolean rodaligaleve;
    Boolean alarme;
    Boolean retrovisoreletro;
    Boolean sensorestacio;
    Boolean chavecanivete;
    Boolean controltrac;
}