package br.com.sisvenda.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sisvenda.database.AcessoMySql;
import br.com.sisvenda.model.Produto;

public class ProdutoRepository {

	public ProdutoRepository() {
	}

	AcessoMySql db = new AcessoMySql();
	String sql_insert = "INSERT INTO produto (descricao,valor) VALUES (?,?)";
	String sql_select_produto = "SELECT * FROM produto p";
	String sql_findById = "SELECT * FROM produto WHERE id = ?";
	String sql_update = "UPDATE  produto c set c.descricao = ? , c.valor = ? where c.id = ?"; // ATUALIZAR
	String sql_delete = "DELETE FROM produto WHERE id = ?";

	public void salvarProduto(Produto produto) {
		PreparedStatement pstm;

		try {

			pstm = db.conectar().prepareStatement(sql_insert);
			pstm.setString(1, produto.getDescricao());
			pstm.setDouble(2, produto.getVlrUnitario());
			pstm.executeUpdate();
			db.desconectar();

			System.out.println(produto + " Salvo com sucesso.");
		} catch (SQLException e) {
			System.out.println("Erro ao salvar.");
			e.printStackTrace();
		}
	}

	public List<Produto> listaProdutos() {
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

	public Produto findById(Integer id) {
		PreparedStatement pstm;
		ResultSet rs;
		Produto produto = null;
		try {
			pstm = db.conectar().prepareStatement(sql_findById);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			while (rs.next()) {
				produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setVlrUnitario(rs.getDouble("valor"));
			}

			System.out.println(produto);
		} catch (SQLException e) {
			System.out.println("Erro no findById");
			e.printStackTrace();
		}
		return produto;
	}

	public void update(Produto produto) {
		PreparedStatement pstm;

		try {
			pstm = db.conectar().prepareStatement(sql_update);
			pstm.setString(1, produto.getDescricao());
			pstm.setDouble(2, produto.getVlrUnitario());
			pstm.setInt(3, produto.getId());
			pstm.executeUpdate();
			db.desconectar();

			System.out.println("produto " + produto.getDescricao() + " Documento" + produto.getVlrUnitario()
					+ " Atualizado com sucesso.");

		} catch (SQLException e) {
			System.out.println("Erro ao atualizar");
			e.printStackTrace();
		}
	}

	public void delete(Integer id) {
		PreparedStatement pstm;

		try {

			pstm = db.conectar().prepareStatement(sql_delete);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			db.desconectar();

			System.out.println("Deletado com sucesso.");

		} catch (SQLException e) {
			System.out.println("Erro ao deletar.");
			e.printStackTrace();
		}

	}
}
