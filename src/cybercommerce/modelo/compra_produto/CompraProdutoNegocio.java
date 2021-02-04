package cybercommerce.modelo.compra_produto;

import java.util.List;

public class CompraProdutoNegocio {

	public void create(CompraProduto compProd) throws Exception {
		CompraProdutoDAO compProdDAO = new CompraProdutoDAO();
		compProdDAO.create(compProd);
	}
	
	public CompraProduto readOne(int compraId, int produtoId) throws Exception {
		CompraProdutoDAO compProdDAO = new CompraProdutoDAO();
		return compProdDAO.readOne(compraId, produtoId);
	}
	
	public List<CompraProduto> readAll() throws Exception {
		CompraProdutoDAO compProdDAO = new CompraProdutoDAO();
		return compProdDAO.readAll();
	}
	
	public void update(CompraProduto compProdAtualizado, int compraId, int produtoId) throws Exception {
		CompraProdutoDAO compProdDAO = new CompraProdutoDAO();
		compProdDAO.update(compProdAtualizado, compraId, produtoId);
	}
	
	public void delete(int compraId, int produtoId) throws Exception {
		CompraProdutoDAO compProdDAO = new CompraProdutoDAO();
		compProdDAO.delete(compraId, produtoId);
	}
	
}
