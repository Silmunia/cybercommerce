package cybercommerce.modelo.compra;

import java.sql.Timestamp;

public class Compra {

	private Integer id;
	private Integer clienteId;
	private Timestamp data;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getClienteId() {
		return clienteId;
	}
	
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	
	public Timestamp getData() {
		return data;
	}
	
	public void setData(Timestamp data) {
		this.data = data;
	}
	
}
