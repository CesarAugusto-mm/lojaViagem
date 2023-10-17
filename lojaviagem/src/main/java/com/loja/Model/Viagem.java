package com.loja.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_viagem")
public class Viagem {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
		
	@NotBlank(message ="Qual o nome da pessoa?")
	private String nome;
	
	@NotBlank(message = "Qual o tipo de locomoção?")
	private String tipo;
	
	@Size(min = 1, max = 10, message = "Quantidade de pessoas permitido de 1 à 10")
	private String pessoas;
	
	@NotBlank(message = "Qual é o destino")
	private String lugar;
	
	private boolean pagamento;
	
	private double quilometragem;
	
	private boolean venda;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPessoas() {
		return pessoas;
	}
	public void setPessoas(String pessoas) {
		this.pessoas = pessoas;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public boolean isPagamento() {
		return pagamento;
	}
	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public boolean isVenda() {
		return venda;
	}
	public void setVenda(boolean venda) {
		this.venda = venda;
	}
	
}
