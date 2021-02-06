package cybercommerce.controle.log;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cybercommerce.modelo.admin.Admin;
import cybercommerce.modelo.admin.AdminNegocio;
import cybercommerce.modelo.cliente.Cliente;
import cybercommerce.modelo.cliente.ClienteNegocio;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuarioLogin = request.getParameter("user");
		String usuarioSenha = request.getParameter("password");
		
		AdminNegocio adminNegocio = new AdminNegocio();
		Admin adminEncontrado = null;
		
		ClienteNegocio clienteNegocio = new ClienteNegocio();
		Cliente clienteEncontrado = null;
		
		String destino = "Front-End/HTML/PagInicial.jsp";
		
		try {
			adminEncontrado = adminNegocio.readOne(usuarioLogin);
		} catch (Exception e1) {
			try {
				clienteEncontrado = clienteNegocio.readOne(usuarioLogin);
			} catch (Exception e2) {
				request.setAttribute("result", "InvalidUser");
			}
		}
		
		if (adminEncontrado != null) {
			if (adminEncontrado.getSenha().equals(usuarioSenha)) {
				destino = "Front-End/HTML/Admin/AreaAdmin-Dados.jsp";
				
				HttpSession session = request.getSession(true);
				session.setAttribute("user", adminEncontrado);
			}
		} else if (clienteEncontrado != null) {
			if (clienteEncontrado.getSenha().equals(usuarioSenha)) {
				destino = "Front-End/HTML/PagInicial.jsp";
				
				HttpSession session = request.getSession(true);
				session.setAttribute("user", clienteEncontrado);
			} else {
				request.setAttribute("result", "InvalidPassword");
				request.setAttribute("login", usuarioLogin);
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
		dispatcher.forward(request, response);
		
	}

}
