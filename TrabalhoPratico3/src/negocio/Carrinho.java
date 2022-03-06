package negocio;

public class Carrinho {
	private double desconto;
	private String cupom;
	private double frete;
	
	public Carrinho(double d, String c, double f) {
		desconto = d;
		cupom = c;
		frete = f;
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
	
}
