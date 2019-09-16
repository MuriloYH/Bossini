package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{

}
