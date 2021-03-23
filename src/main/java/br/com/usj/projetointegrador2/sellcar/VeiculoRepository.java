package br.com.usj.projetointegrador2.sellcar;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
    List<Veiculo> findAll();
}