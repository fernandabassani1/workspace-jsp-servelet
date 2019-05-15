package br.com.sisvenda.model;

public class Funcionario {
	
	private Integer id;	
	private String nome;
	private String email;
	private String rg;
		
	public Funcionario() {}
		
	
	public Funcionario(String nome, String email, String rg) {
		this.nome = nome;
		this.email = email;
		this.rg = rg;
	}



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

	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", rg=" + rg + "]";
	}

	

}
