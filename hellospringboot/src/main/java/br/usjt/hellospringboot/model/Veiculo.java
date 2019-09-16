package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String Modelo;
	
	private String Marca;
	
	private String Cor;
	
	double litro;

	double KilomLit;
	
	double autonomia;
	
	private int AnoDeFabricacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getAnoDeFabricacao() {
		return AnoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		AnoDeFabricacao = anoDeFabricacao;
	}
	
	public double getLitro() {
		return litro;
	}

	public void setLitro(double litro) {
		this.litro = litro;
	}

	public double getKilomLit() {
		return KilomLit;
	}

	public void setKilomLit(double kilomLit) {
		KilomLit = kilomLit;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
}
