package br.com.sisvenda.service;
 
import java.util.List;

import br.com.sisvenda.model.Funcionario;
import br.com.sisvenda.repository.FuncionarioRepository;

 
public class FuncionarioService {
	
	FuncionarioRepository repository = new FuncionarioRepository();
		
	public Funcionario criarFuncionario(String nome, String email, String rg){
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setEmail(email);
		funcionario.setRg(rg);
		repository.salvarFuncionario(funcionario);
		return funcionario;
	}
	
	public List<Funcionario> listaDeFuncionario(){
		return repository.listaDeFuncionario();
	}
	
}
