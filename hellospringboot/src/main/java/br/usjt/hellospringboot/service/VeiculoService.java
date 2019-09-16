package br.usjt.hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.Calculadora;
import br.usjt.hellospringboot.model.Veiculo;
import br.usjt.hellospringboot.repository.VeiculosRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculosRepository veiculosRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Veiculo veiculo) {
		veiculosRepo.save(veiculo);
	}
	
	
	public List <Veiculo> listarTodos (){
		List <Veiculo> veiculos = veiculosRepo.findAll();
		for (Veiculo veiculo : veiculos) 
			veiculo.setAutonomia(calculadora.calculo(veiculo.getLitro(), 
				veiculo.getKilomLit()));
				return veiculos;
	}

	
	
}
