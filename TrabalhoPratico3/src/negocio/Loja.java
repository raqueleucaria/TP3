package negocio;

// Classe para formar uma listas de objetos
public class Loja {
	private Usuario[] usuarios = new Usuario[10];
	private int qtUsuarios;
	private Blusa[] blusas = new Blusa[10];
	private int qtBlusas;
	private Calca[] calcas = new Calca[10];
	private int qtCalcas;
	private Vestido[] vestidos = new Vestido[10];
	private int qtVestidos;
	private Casaco[] casacos = new Casaco[10];
	private int qtCasacos;
	private Bijuteria[] bijuterias = new Bijuteria[10];
	private int qtBijuterias;
	private Relogio[] relogios = new Relogio[10];
	private int qtRelogios;
	
	
	
	//
	
	
	
	//------------------gets e sets -----------------------
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	public int getQtUsuarios() {
		return qtUsuarios;
	}
	public void setQtUsuarios(int qtUsuarios) {
		this.qtUsuarios = qtUsuarios;
	}
	public Blusa[] getBlusas() {
		return blusas;
	}
	public void setBlusas(Blusa[] blusas) {
		this.blusas = blusas;
	}
	public int getQtBlusas() {
		return qtBlusas;
	}
	public void setQtBlusas(int qtBlusas) {
		this.qtBlusas = qtBlusas;
	}
	public Calca[] getCalcas() {
		return calcas;
	}
	public void setCalcas(Calca[] calcas) {
		this.calcas = calcas;
	}
	public int getQtCalcas() {
		return qtCalcas;
	}
	public void setQtCalcas(int qtCalcas) {
		this.qtCalcas = qtCalcas;
	}
	public Vestido[] getVestidos() {
		return vestidos;
	}
	public void setVestidos(Vestido[] vestidos) {
		this.vestidos = vestidos;
	}
	public int getQtVestidos() {
		return qtVestidos;
	}
	public void setQtVestidos(int qtVestidos) {
		this.qtVestidos = qtVestidos;
	}
	public Casaco[] getCasacos() {
		return casacos;
	}
	public void setCasacos(Casaco[] casacos) {
		this.casacos = casacos;
	}
	public int getQtCasacos() {
		return qtCasacos;
	}
	public void setQtCasacos(int qtCasacos) {
		this.qtCasacos = qtCasacos;
	}
	public Bijuteria[] getBijuterias() {
		return bijuterias;
	}
	public void setBijuterias(Bijuteria[] bijuterias) {
		this.bijuterias = bijuterias;
	}
	public int getQtBijuterias() {
		return qtBijuterias;
	}
	public void setQtBijuterias(int qtBijuterias) {
		this.qtBijuterias = qtBijuterias;
	}
	public Relogio[] getRelogios() {
		return relogios;
	}
	public void setRelogios(Relogio[] relogios) {
		this.relogios = relogios;
	}
	public int getQtRelogios() {
		return qtRelogios;
	}
	public void setQtRelogios(int qtRelogios) {
		this.qtRelogios = qtRelogios;
	}
	
	
}