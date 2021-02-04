package cybercommerce.modelo.produto_categoria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoCategoriaDAO {

	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/cybercommerce";
	private static final String JDBC_USER = "minicommerce";
	private static final String JDBC_PASSWORD = "ufc123";
	
	public void create(ProdutoCategoria prodCat) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"INSERT INTO produto_categoria (produto_id, categoria_id) VALUES (?, ?)"
		);
		
		statement.setInt(1, prodCat.getProdutoId());
		statement.setInt(2, prodCat.getCategoriaId());
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Product-Category NOT created!");
		}
		
	}
	
	public ProdutoCategoria readOne(int produtoId, int categoriaId) throws Exception {
		
		ProdutoCategoria prodCat = null;
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT produto_id, categoria_id FROM produto_categoria WHERE produto_id = ? AND categoria_id = ?"
		);
		
		statement.setInt(1, produtoId);
		statement.setInt(2, categoriaId);
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			prodCat = new ProdutoCategoria();
			prodCat.setCategoriaId(statementResult.getInt("categoria_id"));
			prodCat.setProdutoId(statementResult.getInt("produto_id"));
		}
				
		statementResult.close();
		statement.close();
		connection.close();
		
		if (prodCat == null) {
			throw new Exception ("Product-Category NOT found!");
		} else {
			return prodCat;
		}
	}
	
	public List<ProdutoCategoria> readAll() throws Exception {
		
		List<ProdutoCategoria> listaProdCats = new ArrayList<ProdutoCategoria>();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"SELECT produto_id, categoria_id FROM produto_categoria"
		);
		
		ResultSet statementResult = statement.executeQuery();
		
		while (statementResult.next()) {
			ProdutoCategoria prodCat = new ProdutoCategoria();
			prodCat.setCategoriaId(statementResult.getInt("categoria_id"));
			prodCat.setProdutoId(statementResult.getInt("produto_id"));
			
			listaProdCats.add(prodCat);
		}
				
		statementResult.close();
		statement.close();
		connection.close();
		
		if (listaProdCats.isEmpty()) {
			throw new Exception ("NO Product-Category found!");
		} else {
			return listaProdCats;
		}
	}
	
	public void update(ProdutoCategoria prodCatAtualizado, int produtoId, int categoriaId) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"UPDATE produto_categoria SET produto_id = ?, categoria_id = ? WHERE produto_id = ? AND categoria_id = ?"
		);
		
		statement.setInt(1, prodCatAtualizado.getProdutoId());
		statement.setInt(2, prodCatAtualizado.getCategoriaId());
		statement.setInt(3, produtoId);
		statement.setInt(4, categoriaId);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Product-Category NOT updated!");
		}
		
	}
	
	public void delete(int produtoId, int categoriaId) throws Exception {
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		
		PreparedStatement statement = connection.prepareStatement(
				"DELETE FROM produto_categoria WHERE produto_id = ? AND categoria_id = ?"
		);
		
		statement.setInt(1, produtoId);
		statement.setInt(2, categoriaId);
		int statementResult = statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		if (statementResult != 1) {
			throw new Exception ("Product-Category NOT deleted!");
		}
		
	}
	
}
