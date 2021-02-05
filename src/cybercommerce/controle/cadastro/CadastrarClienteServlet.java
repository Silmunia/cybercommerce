package cybercommerce.controle.cadastro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybercommerce.modelo.admin.AdminNegocio;
import cybercommerce.modelo.cliente.Cliente;
import cybercommerce.modelo.cliente.ClienteNegocio;

public class CadastrarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String resultadoProcesso = "";
		
		String clienteNome = request.getParameter("nome");
		String clienteEmail = request.getParameter("email");
		String clienteEndereco = request.getParameter("endereco");
		String clienteLogin = request.getParameter("login");
		String clienteSenha = request.getParameter("senha");
		String clienteConfirm = request.getParameter("confirmacao");
				
		Cliente novoCliente = new Cliente();
		novoCliente.setNome(clienteNome);
		novoCliente.setEmail(clienteEmail);
		novoCliente.setEndereco(clienteEndereco);
		novoCliente.setLogin(clienteLogin);
		novoCliente.setSenha(clienteSenha);
		
		if (!clienteSenha.equals(clienteConfirm)) {
			resultadoProcesso = "NonmatchingPasswords";
			request.setAttribute("newClient", novoCliente);
		} else {
			
			AdminNegocio adminNegocio = new AdminNegocio();
			try {
				adminNegocio.readOne(clienteLogin);
				resultadoProcesso = "AdminConflict";
				request.setAttribute("newClient", novoCliente);
			} catch (Exception e1) {
				
				ClienteNegocio clienteNegocio = new ClienteNegocio();
				try {
					clienteNegocio.create(novoCliente);
					resultadoProcesso = "ClientCreationSuccess";
				} catch (Exception e2) {
					
					resultadoProcesso = "ClientCreationError";
					request.setAttribute("newClient", novoCliente);
				}
			}
		}
		
		request.setAttribute("result", resultadoProcesso);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Front-End/HTML/Public/CadastroCliente.jsp");
		dispatcher.forward(request, response);
		
	}

}
