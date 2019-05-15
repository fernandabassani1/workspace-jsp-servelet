package br.com.sisvenda.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Funcionario;
import br.com.sisvenda.service.FuncionarioService;


@WebServlet("/cadastraFuncionario")
public class CadastraFucionarioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		     String nome = request.getParameter("nome");
		     String email = request.getParameter("email");
		     String rg = request.getParameter("rg");
		    		    		     
		     FuncionarioService service = new FuncionarioService();
		     service.criarFuncionario(nome, email, rg);
		
		    
			//vai mandar a requisicao para a tabela de funcionario
		     response.sendRedirect("listaFuncionario");
	}

}
