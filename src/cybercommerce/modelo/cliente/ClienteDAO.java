package cybercommerce.modelo.cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";
	
	public void create(Cliente cliente) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO cliente (nome, email, endereco, login, senha) VALUES (?, ?, ?, ?, ?)"
		);
		
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getEmail());
		statement.setString(3, cliente.getEndereco());
		statement.setString(4, cliente.getLogin());
		statement.setString(5, cliente.getSenha());
				
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Client NOT created!");
		}
	}
	
	public Cliente readOne(String login) throws Exception {
		
		Cliente cliente = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, nome, endereco, email, login, senha FROM cliente WHERE login = ?"
		);
		
		statement.setString(1, login);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			cliente = new Cliente();
			cliente.setId(statementResult.getInt("id"));
			cliente.setNome(statementResult.getString("nome"));
			cliente.setEndereco(statementResult.getString("endereco"));
			cliente.setEmail(statementResult.getString("email"));
			cliente.setLogin(statementResult.getString("login"));
			cliente.setSenha(statementResult.getString("senha"));
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (cliente == null) {
			throw new Exception ("Cliente NOT found!");
		} else {
			return cliente;
		}
	}
	
	public List<Cliente> readAll() throws Exception {
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, nome, endereco, email, login, senha FROM cliente"
		);
		
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			Cliente cliente = new Cliente();
			cliente.setId(statementResult.getInt("id"));
			cliente.setNome(statementResult.getString("nome"));
			cliente.setEndereco(statementResult.getString("endereco"));
			cliente.setEmail(statementResult.getString("email"));
			cliente.setLogin(statementResult.getString("login"));
			cliente.setSenha(statementResult.getString("senha"));
			
			listaClientes.add(cliente);
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaClientes.isEmpty()) {
			throw new Exception ("NO Clients found!");
		} else {
			return listaClientes;
		}		
	}
	
	public void update(Cliente clienteAtualizado, String login) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE cliente SET nome = ?, endereco = ?, email = ?, senha = ? WHERE login = ?"
		);
		
		statement.setString(1, clienteAtualizado.getNome());
		statement.setString(2, clienteAtualizado.getEndereco());
		statement.setString(3, clienteAtualizado.getEmail());
		statement.setString(4, clienteAtualizado.getSenha());
		statement.setString(5, login);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Client NOT updated!");
		}
		
	}
	
	public void delete(String login) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM cliente WHERE login = ?"
		);
		
		statement.setString(1, login);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Client NOT deleted!");
		}
		
	}
	
}
