package cybercommerce.modelo.compra_produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompraProdutoDAO {

	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";
	
	public void create(CompraProduto compProd) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO compra_produto (compra_id, produto_id, quantidade) VALUES (?, ?, ?)"
		);
		
		statement.setInt(1, compProd.getCompraId());
		statement.setInt(2, compProd.getProdutoId());
		statement.setInt(3, compProd.getQuantidade());
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Purchase-Product NOT created!");
		}
		
	}
	
	public CompraProduto readOne(int compraId, int produtoId) throws Exception {
		
		CompraProduto compProd = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT compra_id, produto_id, quantidade FROM compra_produto WHERE compra_id = ? AND produto_id = ?"
		);
		
		statement.setInt(1, compraId);
		statement.setInt(2, produtoId);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			compProd = new CompraProduto();
			compProd.setCompraId(statementResult.getInt("compra_id"));
			compProd.setProdutoId(statementResult.getInt("produto_id"));
			compProd.setQuantidade(statementResult.getInt("quantidade"));
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (compProd == null) {
			throw new Exception ("Purchase-Product NOT found!");
		} else {
			return compProd;
		}
	}
	
	public List<CompraProduto> readAll() throws Exception {
		
		List<CompraProduto> listaCompProds = new ArrayList<CompraProduto>();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT compra_id, produto_id, quantidade FROM compra_produto"
		);
		
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			CompraProduto compProd = new CompraProduto();
			compProd.setCompraId(statementResult.getInt("compra_id"));
			compProd.setProdutoId(statementResult.getInt("produto_id"));
			compProd.setQuantidade(statementResult.getInt("quantidade"));
			
			listaCompProds.add(compProd);
		}
		
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaCompProds.isEmpty()) {
			throw new Exception ("Purchase-Product NOT found!");
		} else {
			return listaCompProds;
		}
	}
	
	public void update(CompraProduto compProdAtualizado, int compraId, int produtoId) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE compra_produto SET quantidade = ? WHERE compra_id = ? AND produto_id = ?"
		);
		
		statement.setInt(1, compProdAtualizado.getQuantidade());
		statement.setInt(2, compraId);
		statement.setInt(3, produtoId);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Purchase-Product NOT updated!");
		}
		
	}
	
	public void delete(int compraId, int produtoId) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM compra_produto WHERE compra_id = ? AND produto_id = ?"
		);
		
		statement.setInt(1, compraId);
		statement.setInt(2, produtoId);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Purchase-Product NOT deleted!");
		}
		
	}
	
}
