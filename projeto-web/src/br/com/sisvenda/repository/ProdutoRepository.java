package br.com.sisvenda.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sisvenda.database.AcessoMySql;
import br.com.sisvenda.model.Produto;


public class ProdutoRepository {

	public ProdutoRepository(){}
	AcessoMySql db = new AcessoMySql();
	String sql_insert = "INSERT INTO produto (descricao,valor) VALUES (?,?)";
	String sql_select_produto = "SELECT * FROM produto p";


	public void salvarProduto(Produto produto){
		PreparedStatement pstm;


		try {

			pstm=db.conectar().prepareStatement(sql_insert);
			pstm.setString(1,produto.getDescricao());
			pstm.setDouble(2, produto.getVlrUnitario());
			pstm.executeUpdate();
			db.desconectar();

			System.out.println(produto +" Salvo com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao salvar.");
			e.printStackTrace();
		}	
	}
	public List<Produto> listaProdutos(){
		PreparedStatement pstm;
		ResultSet rs;
		List<Produto> produtos = new ArrayList<>();

		try {
			pstm = db.conectar().prepareStatement(sql_select_produto);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Produto produto = new Produto();
				produto.setDescricao(rs.getString("descricao"));
				produto.setVlrUnitario(rs.getDouble("valor"));
				produtos.add(produto);
				
				
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar.");
			e.printStackTrace();
		}
		return produtos;


















	}
}











