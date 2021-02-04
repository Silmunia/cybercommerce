package cybercommerce.modelo.produto;

import java.util.List;

public class ProdutoNegocio {
	
	public void create(Produto produto) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.create(produto);
	}
	
	public Produto readOne(int id) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		return produtoDAO.readOne(id);
	}
	
	public List<Produto> readAll() throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		return produtoDAO.readAll();
	}
	
	public void update(Produto produtoAtualizado, int id) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.update(produtoAtualizado, id);
	}
	
	public void delete(int id) throws Exception {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.delete(id);
	}
	
}
