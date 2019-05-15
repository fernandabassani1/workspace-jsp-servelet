package br.com.sisvenda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sisvenda.service.ClienteService;


@WebServlet("/cadastraCliente")
public class CadastraClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  public CadastraClienteServlet() {
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// trazer um objeto do html  no getParamiter
		
		String nome = request.getParameter("nome");
		String documento = request.getParameter("documento");
	
		
		//instanciar o servico de cliente e chamar o criarCliente, passando o atributo no parametro.
		
		ClienteService service = new ClienteService();
		service.criarCliente(nome, documento);
		
		
		// manda msg na tela web .
		String msg = "cliente " + nome + " salvo com sucesso.";
		HttpSession session = request.getSession();
		session.setAttribute("msg", msg);
		
		response.sendRedirect("listaCliente");
		
		
	}

}
