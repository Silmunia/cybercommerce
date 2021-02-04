package cybercommerce.modelo.compra_produto;

public class CompraProduto {
	
	private Integer compraId;
	private Integer produtoId;
	private Integer quantidade;
	
	public Integer getCompraId() {
		return compraId;
	}
	
	public void setCompraId(Integer compraId) {
		this.compraId = compraId;
	}
	
	public Integer getProdutoId() {
		return produtoId;
	}
	
	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
