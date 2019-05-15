package br.com.sisvenda.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/produtoSalvo")
public class SalvoSucessoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public SalvoSucessoProdutoServlet() {
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/*	response.sendRedirect("salvo");*/
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("salvoSucessoProduto.jsp");
		dispatcher.forward(request, response);
	}
	//comentando aqui :)

}
