
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
			
			return preco * desconto.desconto(preco);
			
		}
		
		public void mostrar() {		
			System.out.println("Nome do produto: " + nome);		
			System.out.println("Preço do produto: " + preco * desconto.desconto(preco));
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}	
		
}
