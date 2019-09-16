package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


import br.usjt.hellospringboot.model.Veiculo;
import br.usjt.hellospringboot.service.VeiculoService;

@Controller
public class VeiculoController {
	
	//@Autowired
	//private veiculosServicesitory veiculosService;
	@Autowired
	private VeiculoService veiculosService;
	
	@GetMapping("/veiculos")
	public ModelAndView listarVeiculos () {
		
		ModelAndView mv = new ModelAndView ("visualiza_veiculos");
		
		List <Veiculo> veiculos = veiculosService.listarTodos();
		
		mv.addObject("veiculos", veiculos);
		
		mv.addObject(new Veiculo());
		
		return mv;
	}
	
	@GetMapping("/veiculoAdmin")
	public ModelAndView listarVeiculos2 () {
		ModelAndView mv = new ModelAndView ("lista_veiculos");
		
		List <Veiculo> veiculos = veiculosService.listarTodos();
		
		mv.addObject("veiculos", veiculos);	
		
		mv.addObject(new Veiculo());
		
		return mv;
	}

	
	@PostMapping("/veiculos")
	public String salvar (Veiculo veiculo) {
		
		veiculosService.salvar(veiculo);
		return "redirect:/veiculos";
		
	} 

}
