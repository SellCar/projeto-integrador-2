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

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String nome;
    String cpf;
    String datanascimentofunc;
    String rua;
    String bairro;
    String cidade;
    String numres; //numero da residencia
    String cep;
    String uf;
    String telefone;
    String emailfunc;
    String cadlogin;
    String cadsenha;
}