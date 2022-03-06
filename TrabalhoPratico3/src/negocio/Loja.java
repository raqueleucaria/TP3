package negocio;

public class Loja {
	public static void main(String[] args) {
		Telefone t1 = new Telefone();
		t1.setDdd(61);
		t1.setNumero(912341234);
		//t1.cadastrarTel();
		
		System.out.println("Telefone \n DDD: "+t1.getDdd()+ "\n Número: "+t1.getNumero());

	}

}
