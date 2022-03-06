package negocio;

import java.util.Date;

public class Pagamento {
	private String tipo;
	private int numeroCartao;
	private int cvc;
	private Date validade;
	
	
	// -------------- Metodo construtor ----------
	public Pagamento(String t, int nc, int cv, Date d) {
		tipo = t;
		numeroCartao = nc;
		cvc = cv;
		validade = d;
	}
	
	//----------------- metodos ------------------
	public void incluirPagamento() {
	
	}
	
	public void excluirPagamento() {
		
	}

	
	
	// ---------------gets e sets ---------------
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	
}
