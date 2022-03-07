package negocio;

public class Teste {
	
	
// instanciando os objetos
	public static void main(String[] args) {
		Usuario u1 = new Usuario("Raquel");
		Usuario u2 = new Usuario("Vera");
		Usuario u3 = new Usuario("Eucaria");
		Usuario u4 = new Usuario("Lucia");
		
		//Usuario u[] = new Usuario[10];
		
		
		// editando Usuario
		u1.editarUsuario("Rakel");
		System.out.print(u1.getNome());
		
		
		
	}

	

}
