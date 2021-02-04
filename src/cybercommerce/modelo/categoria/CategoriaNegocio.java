package cybercommerce.modelo.categoria;

import java.util.List;

public class CategoriaNegocio {

	public void create(Categoria categoria) throws Exception {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.create(categoria);
	}
	
	public Categoria readOne(int id) throws Exception {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		return categoriaDAO.readOne(id);
	}
	
	public List<Categoria> readAll() throws Exception {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		return categoriaDAO.readAll();
	}
	
	public void update(Categoria categoriaAtualizada, int id) throws Exception {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.update(categoriaAtualizada, id);
	}
	
	public void delete(int id) throws Exception {
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.delete(id);
	}
	
}
