package br.com.sisvenda.model;

public class Produto {
	
	private String descricao;
	private double vlrUnitario;
	
	public Produto() {}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getVlrUnitario() {
		return vlrUnitario;
	}

	public void setVlrUnitario(double vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", vlrUnitario=" + vlrUnitario + "]";
	}
	
	
	
	

}
