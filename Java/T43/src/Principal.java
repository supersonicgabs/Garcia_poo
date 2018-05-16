
public class Principal {

		public static void main (String [] args) {
			Produto p = new Produto("Camisa Paisley",500,new IPI("Desconto IPI"));
			Produto p2 = new Produto("Bucket Hat",500,new ICMS("Desconto ICMS"));
			p.calcularPreco();
			p.mostrar();
			p2.calcularPreco();
			p2.mostrar();
		}
}
