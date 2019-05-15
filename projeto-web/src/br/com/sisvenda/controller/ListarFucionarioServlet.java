package br.com.sisvenda.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Funcionario;
import br.com.sisvenda.service.FuncionarioService;


@WebServlet("/listaFuncionario")
public class ListarFucionarioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 List<Funcionario> funcionarios = new FuncionarioService().listaDeFuncionario();
		
		 request.setAttribute("funcionarios", funcionarios);
		    		
		 //manda para tela de lista de funcionario
	    
		 RequestDispatcher dispatcher = request.getRequestDispatcher("listaFuncionario.jsp");
		 dispatcher.forward(request, response);
	}

}
