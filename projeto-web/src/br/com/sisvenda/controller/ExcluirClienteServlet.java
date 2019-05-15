package br.com.sisvenda.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.service.ClienteService;

@WebServlet("/excluirCliente")
public class ExcluirClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ExcluirClienteServlet() {}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//pegar parametros do html (fromtend)
		
		
		ClienteService service = new ClienteService();
		
		String id = request.getParameter("id");
		service.delete(Integer.parseInt(id));
		
		response.sendRedirect("listaCliente");
		 
	}

}
