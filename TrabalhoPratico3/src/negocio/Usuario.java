package negocio;

import java.awt.Image;
import java.util.Date;

public class Usuario {
	private int idUsuario[];
	private Date dataCadastramento;
	private String nome;
	private String email;
	private Date dataNascimento;
	private int cpf;
	private Telefone telefone;
	private Pagamento pagamento;
	private Endereco endereco;
	//private Image fotoPerfil;
	//private Image fotoCapa;
	
	int numUsuarios;
	// --------- Metodo construtor ----------
	public Usuario(int id, Date dc, String n, String e, Date dn, int c) {
		idUsuario = id;
		dataCadastramento = dc;
		nome = n;
		email = e;
		dataNascimento = dn;
		cpf = c;
		
	}

	//-------------- metodos ----------------
		public void cadastrarUsuario(int numUsuarios) {
			idUsuario = 
		}
		
		public void editarUsuario() {
			
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
	

}
