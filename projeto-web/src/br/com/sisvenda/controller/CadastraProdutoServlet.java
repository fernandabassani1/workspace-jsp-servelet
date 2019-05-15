package br.com.sisvenda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.repository.ClienteRepository;
import br.com.sisvenda.service.ProdutoService;


@WebServlet("/cadastraProduto")
public class CadastraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Descricao = request.getParameter("descricao");
		double Valor = Double.parseDouble(request.getParameter("valor"));
		
		ProdutoService service = new  ProdutoService();
		service.criarProduto(Descricao, Valor);
			
		
/*		
*/		response.sendRedirect("produtoSalvo");

		

	}

}
