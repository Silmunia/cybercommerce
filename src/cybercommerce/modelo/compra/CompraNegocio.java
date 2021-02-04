package cybercommerce.modelo.compra;

import java.util.List;

public class CompraNegocio {
	
	public void create(Compra compra) throws Exception {
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.create(compra);
	}
	
	public Compra readOne(int id) throws Exception {
		CompraDAO compraDAO = new CompraDAO();
		return compraDAO.readOne(id);
	}
	
	public List<Compra> readAll() throws Exception {
		CompraDAO compraDAO = new CompraDAO();
		return compraDAO.readAll();
	}
	
	public void update(Compra compraAtualizada, int id) throws Exception {
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.update(compraAtualizada, id);
	}
	
	public void delete(int id) throws Exception {
		CompraDAO compraDAO = new CompraDAO();
		compraDAO.delete(id);
	}
	
}
