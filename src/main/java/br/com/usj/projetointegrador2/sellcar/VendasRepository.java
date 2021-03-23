package br.com.usj.projetointegrador2.sellcar;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VendasRepository extends CrudRepository<Vendas, Long> {
    List<Vendas> findAll();
}