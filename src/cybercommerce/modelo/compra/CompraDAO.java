package cybercommerce.modelo.compra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompraDAO {
	
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";
	
	public void create(Compra compra) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO compra (data/hora, cliente_id) VALUES (?, ?)"
		);
		
		statement.setTimestamp(1, compra.getData());
		statement.setInt(2, compra.getClienteId());
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Purchase NOT created!");
		}
		
	}
	
	public Compra readOne(int id) throws Exception {
		
		Compra compra = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, data/hora, cliente_id FROM compra WHERE id = ?"
		);
		
		statement.setInt(1, id);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			compra = new Compra();
			compra.setId(statementResult.getInt("id"));
			compra.setClienteId(statementResult.getInt("cliente_id"));
			compra.setData(statementResult.getTimestamp("data/hora"));
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (compra == null) {
			throw new Exception ("Purchase NOT found!");
		} else {
			return compra;
		}
	}
	
	public List<Compra> readAll() throws Exception {
		
		List<Compra> listaCompras = new ArrayList<Compra>();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, data/hora, cliente_id FROM compra"
		);

		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			Compra compra = new Compra();
			compra.setId(statementResult.getInt("id"));
			compra.setClienteId(statementResult.getInt("cliente_id"));
			compra.setData(statementResult.getTimestamp("data/hora"));
			
			listaCompras.add(compra);
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaCompras.isEmpty()) {
			throw new Exception ("NO Purchase found!");
		} else {
			return listaCompras;
		}
	}
	
	public void update(Compra compraAtualizada, int id) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE compra SET cliente_id = ?, data/hora = ? WHERE id = ?"
		);
		
		statement.setInt(1, compraAtualizada.getClienteId());
		statement.setTimestamp(2, compraAtualizada.getData());
		statement.setInt(3, id);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Purchase NOT updated!");
		}
		
	}
	
	public void delete(int id) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM compra WHERE id = ?"
		);
		
		statement.setInt(1, id);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Purchase NOT deleted!");
		}
		
	}
	
}
