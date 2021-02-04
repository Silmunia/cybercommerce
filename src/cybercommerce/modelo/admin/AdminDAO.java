package cybercommerce.modelo.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
	
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";
	
	public Admin readOne(String login) throws Exception {
		
		Admin admin = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, nome, email, login, senha FROM administrador WHERE login = ?"
		);
		
		statement.setString(1, login);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			admin = new Admin();
			admin.setId(statementResult.getInt("id"));
			admin.setNome(statementResult.getString("nome"));
			admin.setEmail(statementResult.getString("email"));
			admin.setLogin(statementResult.getString("login"));
			admin.setSenha(statementResult.getString("senha"));
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (admin == null) {
			throw new Exception ("Admin NOT found!");
		} else {
			return admin;
		}
	}
	
	public List<Admin> readAll() throws Exception {
		
		List<Admin> listaAdmins = new ArrayList<Admin>();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, nome, email, login, senha FROM administrador"
		);
		
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			Admin admin = new Admin();
			admin.setId(statementResult.getInt("id"));
			admin.setNome(statementResult.getString("nome"));
			admin.setEmail(statementResult.getString("email"));
			admin.setLogin(statementResult.getString("login"));
			admin.setSenha(statementResult.getString("senha"));
			
			listaAdmins.add(admin);
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaAdmins.isEmpty()) {
			throw new Exception ("NO Admins found!");
		} else {
			return listaAdmins;
		}
	}
	
	public void update(Admin adminAtualizado, String login) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE administrador SET nome = ?, email = ?, senha = ? WHERE login = ?"
		);
		
		statement.setString(1, adminAtualizado.getNome());
		statement.setString(2, adminAtualizado.getEmail());
		statement.setString(3, adminAtualizado.getSenha());
		statement.setString(4, login);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Admin NOT updated!");
		}
		
	}
	
	public void delete(String login) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM administrador WHERE login = ?"
		);
		
		statement.setString(1, login);
		int statementResult = statement.executeUpdate();
		
		if (statementResult != 1) {
			throw new Exception ("Admin NOT deleted!");
		}
		
	}
	
}
