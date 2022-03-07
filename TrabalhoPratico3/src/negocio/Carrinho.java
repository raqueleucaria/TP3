package negocio;

public class Carrinho {
	private double desconto;
	private String cupom;
	private double frete;
	private Produto item; 
	
	public Carrinho(double d, String c, double f, Produto p) {
		desconto = d;
		cupom = c;
		frete = f;
		item = p;
	}
	
	//-------------- metodos ----------------
	public void comprar() {
	
	}
	
	public void deletarItem() {
		
	}
	
	
	// -----------gets e sets ------------
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public Produto getItem() {
		return item;
	}

	public void setItem(Produto item) {
		this.item = item;
	}
	
	
	
}