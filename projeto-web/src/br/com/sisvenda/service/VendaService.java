package br.com.sisvenda.service;


import java.util.List;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.model.Funcionario;
import br.com.sisvenda.model.Produto;
import br.com.sisvenda.model.Venda;


public class VendaService {
		// salvando .
	public Venda criarVenda(Cliente cliente, Funcionario funcionario, List<Produto> produto, String data){
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setProduto(produto);
		venda.setVenda(venda);
		venda.setData(data);
		return venda;
	}

	public void totais(List<Produto> listaDeProduto) {
		
		double valor = 0;
		
		for (int i = 0; i < listaDeProduto.size(); i++) {
			Produto produto = listaDeProduto.get(i);
			
			System.out.println(produto);
			valor = valor + produto.getVlrUnitario();
		}
		System.out.println(valor);
	}
}

