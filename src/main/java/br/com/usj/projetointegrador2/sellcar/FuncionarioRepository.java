package br.com.usj.projetointegrador2.sellcar;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
    List<Funcionario> findAll();
}