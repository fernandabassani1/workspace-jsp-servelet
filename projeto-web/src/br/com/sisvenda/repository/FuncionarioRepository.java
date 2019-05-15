package br.com.sisvenda.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sisvenda.database.AcessoMySql;
import br.com.sisvenda.model.Funcionario;

public class FuncionarioRepository {

		
	public FuncionarioRepository(){}

	AcessoMySql db = new AcessoMySql();

	String sql_select = "SELECT * FROM funcionario f order by f.id desc";
	String sql_select_funcionario = "SELECT * FROM funcionario f WHERE f.nome LIKE ? ";
	String sql_insert = "INSERT INTO funcionario (nome, email, rg) VALUES (?, ?, ?)";
	String sql_delete = "DELETE FROM funcionario WHERE id= ?";
	String sql_update = "UPDATE funcionario SET nome=? WHERE id= ?";
	String sql_findById = "SELECT * from funcionario WHERE id= ?";
	
	public List<Funcionario> listaDeFuncionario(){
		PreparedStatement pstm;
		ResultSet rs;
		List<Funcionario> listando = new ArrayList<>();

		try {
			pstm = db.conectar().prepareStatement(sql_select);
			rs = pstm.executeQuery();

			Funcionario funcionario;

			while (rs.next()) {
				funcionario = new Funcionario();
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setRg(rs.getString("rg"));
				listando.add(funcionario);

			}
		} catch (SQLException e) {
			System.out.println("Banco fora do Ar.");
			e.printStackTrace();
		}
		return listando;		
	}	


	public List<Funcionario> listaFuncionario(String nome){
		PreparedStatement pstm;
		ResultSet rs;
		List<Funcionario>listandoFuncionario = new ArrayList<>();

		try {

			Funcionario funcionario;
			pstm = db.conectar().prepareStatement(sql_select_funcionario);
			pstm.setString(1, nome + "%");
			rs = pstm.executeQuery();

			while (rs.next()) {
				funcionario = new Funcionario();
				funcionario.setNome(rs.getString("nome"));
				listandoFuncionario.add(funcionario);

			}

		} catch (SQLException e) {
			System.out.println("Error.");
			e.printStackTrace();
		}
		return listandoFuncionario;	
	}
	
	public void salvarFuncionario(Funcionario funcionario){
		PreparedStatement pstm;
		try {
			pstm = db.conectar().prepareStatement(sql_insert);
			pstm.setString(1,funcionario.getNome());
			pstm.setString(2,funcionario.getEmail());
			pstm.setString(3,funcionario.getRg());
			pstm.executeUpdate();
			db.desconectar();

			System.out.println(funcionario + "salvo com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
	}
	
	public Funcionario findById(Integer id){
		PreparedStatement pstm;
		ResultSet rs;
		
		Funcionario funcionario = null;
		
		try {
			pstm = db.conectar().prepareStatement(sql_findById);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			
			
			while (rs.next()) {
				funcionario = new Funcionario();
				funcionario.setId(rs.getInt("id"));
				funcionario.setNome(rs.getString("nome"));
			}
			System.out.println(funcionario);
		} catch (SQLException e) {
			System.out.println("Erro no findById");
			e.printStackTrace();
		}
		return funcionario;
		
		
	}

		
	

}


