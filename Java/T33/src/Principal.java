
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constelacao c = new Constelacao("Nome Constelação", 3);
		Estrela e0 = new Estrela("Endor", 45.5, "Azul");
		Estrela e1 = new Estrela("Tatooine 1", 32.1, "Vermelho");
		Estrela e2 = new Estrela("Coruscant", 20, "Verde");			
		
		c.adicionar(e0);
		c.adicionar(e1);
		c.adicionar(e2);
		
		e0.mostrar();
		e1.mostrar();
		e2.mostrar();
		
		c.infoEstrelas();
		
		System.out.println("Total das temperaturas: " + c.tempConstelacao());
		
	}

}
