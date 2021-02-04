package cybercommerce.modelo.produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
	
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";

	public void create(Produto produto) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO produto (desc, foto, preco, quantidade) VALUES (?, ?, ?, ?)"
		);
		
		statement.setString(1, produto.getDesc());
		statement.setString(2, produto.getFoto());
		statement.setDouble(3, produto.getPreco());
		statement.setInt(4, produto.getQuantidade());
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Product NOT created!");
		}
		
	}
	
	public Produto readOne(int id) throws Exception {
		
		Produto produto = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, desc, foto, preco, quantidade FROM produto WHERE id = ?"
		);
		
		statement.setInt(0, id);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			produto = new Produto();
			produto.setId(statementResult.getInt("id"));
			produto.setDesc(statementResult.getString("desc"));
			produto.setFoto(statementResult.getString("foto"));
			produto.setPreco(statementResult.getDouble("preco"));
			produto.setQuantidade(statementResult.getInt("quantidade"));
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (produto == null) {
			throw new Exception ("Product NOT found!");
		} else {
			return produto;
		}
	}
	
	public List<Produto> readAll() throws Exception {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT id, desc, foto, preco, quantidade FROM produto"
		);
		
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			Produto produto = new Produto();
			produto.setId(statementResult.getInt("id"));
			produto.setDesc(statementResult.getString("desc"));
			produto.setFoto(statementResult.getString("foto"));
			produto.setPreco(statementResult.getDouble("preco"));
			produto.setQuantidade(statementResult.getInt("quantidade"));
			
			listaProdutos.add(produto);
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaProdutos.isEmpty()) {
			throw new Exception ("NO Products found!");
		} else {
			return listaProdutos;
		}
	}
	
	public void update(Produto produtoAtualizado, int id) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE produto SET desc = ?, foto = ?, preco = ?, quantidade = ? WHERE id = ?"
		);
		
		statement.setString(1, produtoAtualizado.getDesc());
		statement.setString(2, produtoAtualizado.getFoto());
		statement.setDouble(3, produtoAtualizado.getPreco());
		statement.setInt(4, produtoAtualizado.getQuantidade());
		statement.setInt(5, id);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Product NOT updated!");
		}
		
	}
	
	public void delete(int id) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM produto WHERE id = ?"
		);
		
		statement.setInt(1, id);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Product NOT deleted!");
		}
		
	}
	
}
