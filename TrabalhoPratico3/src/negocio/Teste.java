package negocio;

public class Teste {
	
	
// instanciando os objetos
	public static void main(String[] args) {
	//cadastrando usuario
		Endereco e1 = new Endereco(71,2,"rua maria","casa 12");
		Pagamento p1 = new Pagamento(555,987,2023);
		Telefone t1 = new Telefone(61,999);
		Usuario u1 = new Usuario(1,"Raquel",1234,t1,p1,e1);
		
		Endereco e2 = new Endereco(92,9,"avenida parque","casa 2");
		Pagamento p2 = new Pagamento(5033,241,1922);
		Telefone t2 = new Telefone(61,988);
		Usuario u2 = new Usuario(2,"Vera",0531,t2,p2,e2);
		
		System.out.println(u1.toString());
		System.out.println();
		System.out.println(u2.toString());
		
	//cadastrandoProduto
		//------ BLUSA

		Blusa b1 = new Blusa(1,
							"Cropped pra reagir", 
							"Renner", 
							29, 
							"feminino", 
							"Leve e confortavel", 
							"Preto", 
							"M",
							"Cropped");
		System.out.println(b1.toString());
		
		
		
	//adicionandoItem
		
	//comprando
	}

	

}
