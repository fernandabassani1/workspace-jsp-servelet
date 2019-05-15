package br.com.sisvenda.model;

public class Cliente {
			
	//atributo 
	private Integer id;
	private String nome;
	private String documento;
	
	
	//Construtor vazio - padrao
	public Cliente() {}
			

	public Cliente(Integer id, String nome, String documento) {
		this.id = id;
		this.nome = nome;
		this.documento = documento;
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", documento=" + documento + "]";
	}

}
