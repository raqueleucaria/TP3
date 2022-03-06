package negocio;

public class Telefone {
	private int ddd;
	private int numero;
	
	
	// --------- Metodo construtor ----------
	public Telefone(int d, int n) {
		ddd = d;
		numero = n;
	}
	
	//-------------- metodos ----------------
	public void cadastrarTel() {
		int tel;
		int d = this.getDdd();
		int n = this.getNumero();
		
		
	}
	
	
	
	/*public void cadastrarTel() {
		System.out.println("Cadastrar telefone:");
		System.out.println("DDD: " + this.getDdd());
		System.out.println("numero: "+this.getNumero());
	}
	*/
	
	public void editarTel() {
		
	}
	
	public void excluirTel() {
		
	}

	
	// -----------gets e sets ------------
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}	