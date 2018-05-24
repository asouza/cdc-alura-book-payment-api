package br.com.alura.bookpayment;

import java.math.BigDecimal;

public class Preco {

	private BigDecimal valor;
	private String tipo;

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal preco) {
		this.valor = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Preco [preco=" + valor + ", tipo=" + tipo + "]";
	}
	
	

}
