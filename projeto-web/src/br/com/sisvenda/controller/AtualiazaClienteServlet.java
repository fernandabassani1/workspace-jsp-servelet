package br.com.sisvenda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.service.ClienteService;


@WebServlet("/atualizaCliente")
public class AtualiazaClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AtualiazaClienteServlet() {
 
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String nome = request.getParameter("nome");
		String documento = request.getParameter("documento");
		
		Cliente cliente = new Cliente(Integer.parseInt(id),nome,documento);
		ClienteService clienteService = new ClienteService();
		clienteService.update(cliente);
		
		response.sendRedirect("listaCliente");
	}

}
