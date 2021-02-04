package cybercommerce.modelo.produto_categoria;

import java.util.List;

public class ProdutoCategoriaNegocio {

	public void create(ProdutoCategoria prodCat) throws Exception {
		ProdutoCategoriaDAO prodCatDAO = new ProdutoCategoriaDAO();
		prodCatDAO.create(prodCat);
	}
	
	public ProdutoCategoria readOne(int produtoId, int categoriaId) throws Exception {
		ProdutoCategoriaDAO prodCatDAO = new ProdutoCategoriaDAO();
		return prodCatDAO.readOne(produtoId, categoriaId);
	}
	
	public List<ProdutoCategoria> readAll() throws Exception {
		ProdutoCategoriaDAO prodCatDAO = new ProdutoCategoriaDAO();
		return prodCatDAO.readAll();
	}
	
	public void update(ProdutoCategoria prodCatAtualizado, int produtoId, int categoriaId) throws Exception {
		ProdutoCategoriaDAO prodCatDAO = new ProdutoCategoriaDAO();
		prodCatDAO.update(prodCatAtualizado, produtoId, categoriaId);
	}
	
	public void delete(int produtoId, int categoriaId) throws Exception {
		ProdutoCategoriaDAO prodCatDAO = new ProdutoCategoriaDAO();
		prodCatDAO.delete(produtoId, categoriaId);
	}
	
}
