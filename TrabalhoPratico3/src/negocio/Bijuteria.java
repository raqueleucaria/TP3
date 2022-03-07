package negocio;

public class Bijuteria extends Produto{
	private String modeloBijuteria;
	
	public Bijuteria() {
		super();
	}
	
	// ---------------- Metodo construtor -------------
	public Bijuteria (String n, int idP, String m, String c, String sc, double p, String cond, String dep, String des, String co, String tam,/* Usuario idC, Usuario idV,*/ String mod) {
		nome = n;
		idProduto = idP;
		marca = m;
		preco = p;
		condicao = cond;
		departamento = dep;
		descricao = des;
		cor = co;
		tamanho = tam;
		//protected Image fotoProduto[];
		//idCliente = idC;
		//idVendedor = idV;
		
		modeloBijuteria = mod;
	}

	//---------------Metodos--------------------------
	
	public void cadastrar() {
		
	}
	
	public void editar() {
		
	}
	public void filtrar() {
		
	}
	
	public void deletar() {
		
	}
	
	public void adicionarItem() {
		
	}
	
	
	//---------------gets e sets---------------------
	
	public String getModeloCalca() {
		return modeloBijuteria;
	}

	public void setModeloCalca(String modeloCalca) {
		this.modeloBijuteria = modeloCalca;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	/*
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
	*/

	
	
}