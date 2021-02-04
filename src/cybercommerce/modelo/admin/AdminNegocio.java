package cybercommerce.modelo.admin;

import java.util.List;

public class AdminNegocio {
	
	public Admin readOne(String login) throws Exception {
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.readOne(login);
	}
	
	public List<Admin> readAll() throws Exception {
		AdminDAO adminDAO = new AdminDAO();
		return adminDAO.readAll();
	}
	
	public void update(Admin adminAtualizado, String login) throws Exception {
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.update(adminAtualizado, login);
	}
	
	public void delete(String login) throws Exception {
		AdminDAO adminDAO = new AdminDAO();
		adminDAO.delete(login);
	}
	
}
