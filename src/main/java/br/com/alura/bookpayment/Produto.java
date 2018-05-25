package br.com.alura.bookpayment;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Produto {

	private String titulo;
	private String descricao;
	private int paginas;
	private List<Preco> precos = new ArrayList<>();
	private long dataLancamento;
	
	

	public long getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(long dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public List<Preco> getPrecos() {
		return precos;
	}

	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}

	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao
				+ ", paginas=" + paginas + ", precos=" + precos
				+ ", dataLancamento=" + dataLancamento + "]";
	}
	
	

}
