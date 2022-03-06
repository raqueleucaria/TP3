package negocio;

public class Endereco {
	private int CEP;
	private int lote;
	private String nomeRuaAvenida;
	private String complemento;
	
	// -------------- Metodo construtor -------------
	public Endereco(int c, int l, String n, String comp) {
		CEP = c;
		lote = l;
		nomeRuaAvenida = n;
		complemento = comp;
	}
	
	//------------------- metodos ------------------

	public void cadastrarEnd() {
		
	}
	
	public void editarEnd() {
		
	}
	
	public void excluirEnd() {
		
	}
	
	
	
	// ---------------gets e sets ------------------
	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getNomeRuaAvenida() {
		return nomeRuaAvenida;
	}

	public void setNomeRuaAvenida(String nomeRuaAvenida) {
		this.nomeRuaAvenida = nomeRuaAvenida;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
