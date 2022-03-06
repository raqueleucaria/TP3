package negocio;

import java.util.Date;

public class Compra {
	private Date dataCompra;
	private String status;
	private int numeroPedido;
	
	public Compra(Date dc, String s, int np) {
		dataCompra = dc;
		status = s;
		numeroPedido = np;
		
	}
	
	//-------------- metodos ----------------
	public void confirmar() {
	
	}
	
	public void cancelar() {
		
	}
	
	public void editarEndereco() {
		
	}

	
	// -----------gets e sets ------------
	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	
}
