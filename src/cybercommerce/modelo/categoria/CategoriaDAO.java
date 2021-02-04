package cybercommerce.modelo.categoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
	
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";
	
	public void create(Categoria categoria) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO categoria (desc) VALUES (?)"
		);
		
		statement.setString(1, categoria.getDesc());
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Category NOT created!");
		}
		
	}
	
	public Categoria readOne(int id) throws Exception {
		
		Categoria categoria = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, desc FROM categoria WHERE id = ?"
		);
		
		statement.setInt(1, id);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			categoria = new Categoria();
			categoria.setId(statementResult.getInt("id"));
			categoria.setDesc(statementResult.getString("desc"));
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (categoria == null) {
			throw new Exception ("Category NOT found!");
		} else {
			return categoria;
		}
	}
	
	public List<Categoria> readAll() throws Exception {
		
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, desc FROM categoria"
		);
		
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			Categoria categoria = new Categoria();
			categoria.setId(statementResult.getInt("id"));
			categoria.setDesc(statementResult.getString("desc"));
			
			listaCategorias.add(categoria);
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaCategorias.isEmpty()) {
			throw new Exception ("NO Category found!");
		} else {
			return listaCategorias;
		}
	}
	
	public void update(Categoria categoriaAtualizada, int id) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE categoria SET desc = ? WHERE id = ?"
		);
		
		statement.setString(1, categoriaAtualizada.getDesc());
		statement.setInt(2, id);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Category NOT updated!");
		}
	}
	
	public void delete(int id) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM categoria WHERE id = ?"
		);
		
		statement.setInt(1, id);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Category NOT deleted!");
		}
		
	}

}
