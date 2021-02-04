package cybercommerce.modelo.cliente;

import java.util.List;

public class ClienteNegocio {
	
	public void create(Cliente client) throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.create(client);
	}
	
	public Cliente readOne(String login) throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO();
		return clienteDAO.readOne(login);
	}
	
	public List<Cliente> readAll() throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO();
		return clienteDAO.readAll();
	}
	
	public void update(Cliente updatedClient, String login) throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.update(updatedClient, login);
	}
	
	public void delete(String login) throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.delete(login);
	}

}
