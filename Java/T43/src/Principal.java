
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p = new Produto("Camisa Paisley", 500, Tipo.IPI);
		Produto p2 = new Produto("Camisa Paisley", 500, Tipo.ICMS);
		p.mostrar();
		p2.mostrar();
	}

}
