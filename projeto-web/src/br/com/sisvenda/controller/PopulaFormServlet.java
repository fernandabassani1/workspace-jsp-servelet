package br.com.sisvenda.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.service.ClienteService;


@WebServlet("/populaForm")
public class PopulaFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PopulaFormServlet() {

    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		ClienteService clienteService = new ClienteService();
		Cliente cliente = clienteService.findById(Integer.parseInt(id));
		
		request.setAttribute("cliente", cliente);
		 
		RequestDispatcher dispatcher = request.getRequestDispatcher("atualizaCliente.jsp"); 
		dispatcher.forward(request, response);
		
	}

}
