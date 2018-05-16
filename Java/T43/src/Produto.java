
public class Produto {
	
		private String nome;
		private double preco;
		private Desconto desconto;
		public Produto(String nome, double preco, Desconto desconto) {
			this.nome = nome;
			this.preco = preco;
			this.desconto = desconto;
		}
		public void setPromocao(Desconto desconto) {
			this.desconto = desconto;
		}
		
		public double calcularPreco() {
			
//A vinculacao dinamica vai chamar o calculo do desconto de acordo com o objeto atrelado à variavel promocao
// do tipo promocao. O polimorfismo ajudou com a abertura de outras promocoes a serem atreladas a este
//atributo.			
			return preco * desconto.desconto(preco);
			
		}
		
		public void mostrar() {		
			System.out.println("Nome do produto: " + nome);		
			System.out.println("Preço do produto: " + preco * desconto.desconto(preco));
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}	
		
}
