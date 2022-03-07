package negocio;

import java.awt.Image;
import java.util.Date;

public class Usuario {
	private int idUsuario;
	private Date dataCadastramento;
	private String nome;
	private String email;
	private String senha;
	private Date dataNascimento;
	private int cpf;
	private Telefone telefone;
	private Pagamento pagamento;
	private Endereco endereco;
	//private Image fotoPerfil;
	//private Image fotoCapa;
	
	 
	// --------- Metodo construtor ----------
	public Usuario(String n/*,int id, Date dc,  String e, Date dn, int c, Telefone t, Pagamento p, Endereco end*/) {
		//idUsuario = id;
		//dataCadastramento = dc;
		nome = n;
		//email = e;
		//dataNascimento = dn;
		//cpf = c;
		//telefone = t;
		//pagamento = p;
		//endereco = end;
		
	}

	//-------------- metodos ----------------
		public void cadastrarUsuario() {
			
		}
		
		public void editarUsuario(String e) {
			this.nome = e;
		}
		
		public void buscarUsuario() {
			
		}
		
		public void deletarUsuario() {
			
		}
	
	
	// -----------gets e sets ------------
	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Date getDataCadastramento() {
		return dataCadastramento;
	}


	public void setDataCadastramento(Date dataCadastramento) {
		this.dataCadastramento = dataCadastramento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	

}