package br.com.sisvenda.model;

import java.util.List;

public class Venda {
	
	private Cliente cliente;
	private Funcionario funcionario;
	private List<Produto> produto;
	private Venda venda;
	private String data;
	
	public Venda() {}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Venda [cliente=" + cliente + ", funcionario=" + funcionario + ", produto=" + produto + ", venda="
				+ venda + ", data=" + data + "]";
	}

	

	
	
}
