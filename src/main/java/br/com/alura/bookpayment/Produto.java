package br.com.alura.bookpayment;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private int id;
	private String titulo;
	private String descricao;
	private int paginas;
	private String sumarioPath;
	private List<Preco> precos = new ArrayList<>();
	private long dataLancamento;
	
	

	public long getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(long dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSumarioPath() {
		return sumarioPath;
	}

	public void setSumarioPath(String sumarioPath) {
		this.sumarioPath = sumarioPath;
	}

	public List<Preco> getPrecos() {
		return precos;
	}

	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao
				+ ", paginas=" + paginas + ", sumarioPath=" + sumarioPath + ", precos=" + precos
				+ ", dataLancamento=" + dataLancamento + "]";
	}
	
	

}
