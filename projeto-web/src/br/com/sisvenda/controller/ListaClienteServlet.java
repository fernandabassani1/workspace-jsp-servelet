package br.com.sisvenda.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.service.ClienteService;

@WebServlet("/listaCliente") 
public class ListaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// lista de clientes
		List<Cliente> clientes =  new ClienteService().listaDecliente();
		 request.setAttribute("clientes", clientes);
		 
		 //manda para tela de lista de cliente
		 RequestDispatcher dispatcher = request.getRequestDispatcher("listaCliente.jsp"); 
		 dispatcher.forward(request, response); 
		 
	}
  
}