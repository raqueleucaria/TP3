package negocio;

public class Carrinho {
	private double frete = 30.0; //frete fixo
	private double valorTotal;
	
	//preço
	private Blusa blusa;
	private Calca calca;
	private Bijuteria bijuteria;
	
	public Carrinho(Blusa blusa, Calca calca, Bijuteria bijuteria) {
		this.blusa = blusa;
		this.calca = calca;
		this.bijuteria = bijuteria;
	}
	
	public String toString() {
		String resumo = "";
		double valor = 0;
		if (blusa!= null) {
			valor += blusa.preco;
			resumo += "\nBlusa\nNome: "+blusa.nome+"\n1x "+blusa.preco+ "\ntam: "+blusa.tamanho+"\n";
		}
		if (calca!= null) {
			valor += calca.preco;
			resumo += "\nCalça\nNome: "+calca.nome+"\n1x "+calca.preco+ "\ntam: "+calca.tamanho+"\n";
		} 
		if (bijuteria!= null) {
			valor += bijuteria.preco;
			resumo += "\nBijuteria\nNome: "+bijuteria.nome+"\n1x "+bijuteria.preco+ "\ntam: "+bijuteria.tamanho+"\n";
		}
		
		valorTotal = valor + frete;
		
		return 	" --------- Carrinho ------------" +
				resumo +
				"\nPreço do(s) produto(s): "+ valor +
				"\nFrete: R$ 30 reais"+
				"\n\n\tValor total: " + valorTotal; 
				
	}
	
	
	
	//-------------- metodos ----------------
	public void comprar() {
	}
	
	public void deletarItem() {
	}
	
	
	// -----------gets e sets ------------
	

	


	
	
	
}