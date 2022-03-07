package negocio;

import java.util.Date;

public class Compra {
	private Date dataCompra;
	private String statusCompra;
	private int numeroPedido;
	
	private Usuario idCliente;
	private Usuario idVendedor;
	private Usuario pagamento;
	private Usuario endVendedor;
	private Usuario endCliente;
	
	private Carrinho cupom;
	private Carrinho valorTotal;
	private Carrinho desconto;
	private Carrinho frete;
	private Carrinho tamProduto;
	private Carrinho fotoProduto;
	private Carrinho nomeProduto;
	private Carrinho valorProduto;
	//private Produto fotoProduto[];
	

	public Compra(Date dc, String s, int np, Usuario idC, Usuario idV, Usuario pg, Usuario endC, Usuario endV, Carrinho cup, Carrinho vt, Carrinho desc, Carrinho f, Carrinho tam, Carrinho ft, Carrinho nome, Carrinho vp) {
		dataCompra = dc;
		statusCompra = s;
		numeroPedido = np;
		
		idCliente = idC;
		idVendedor = idV;
		pagamento = pg;
		endCliente = endC;
		endVendedor = endV;
		
		
		cupom = cup;
		valorTotal = vt;
		desconto = desc;
		frete = f;
		tamProduto = tam;
		//fotoProduto = ft;
		nomeProduto = nome;
		valorProduto = vp;
		
		
	}
	
	//------------------------ metodos -----------------------
	public void confirmar() {
	
	}
	
	public void cancelar() {
		
	}
	
	public void editarEndereco() {
		
	}

	
	// -------------------gets e sets -----------------------
	
	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getStatusCompra() {
		return statusCompra;
	}

	public void setStatusCompra(String statusCompra) {
		this.statusCompra = statusCompra;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Usuario getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Usuario idCliente) {
		this.idCliente = idCliente;
	}

	public Usuario getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Usuario idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Usuario getPagamento() {
		return pagamento;
	}

	public void setPagamento(Usuario pagamento) {
		this.pagamento = pagamento;
	}

	public Usuario getEndVendedor() {
		return endVendedor;
	}

	public void setEndVendedor(Usuario endVendedor) {
		this.endVendedor = endVendedor;
	}

	public Usuario getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(Usuario endCliente) {
		this.endCliente = endCliente;
	}

	public Carrinho getCupom() {
		return cupom;
	}

	public void setCupom(Carrinho cupom) {
		this.cupom = cupom;
	}

	public Carrinho getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Carrinho valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Carrinho getDesconto() {
		return desconto;
	}

	public void setDesconto(Carrinho desconto) {
		this.desconto = desconto;
	}

	public Carrinho getFrete() {
		return frete;
	}

	public void setFrete(Carrinho frete) {
		this.frete = frete;
	}

	public Carrinho getTamProduto() {
		return tamProduto;
	}

	public void setTamProduto(Carrinho tamProduto) {
		this.tamProduto = tamProduto;
	}

	public Carrinho getFotoProduto() {
		return fotoProduto;
	}

	
	public void setNomeProduto(Carrinho nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Carrinho getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Carrinho valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	/*
	 
	 public void setFotoProduto(Carrinho fotoProduto) {
		this.fotoProduto = fotoProduto;
	}
	public Carrinho getNomeProduto() {
		return nomeProduto;
	}
	
	
   */
	
}