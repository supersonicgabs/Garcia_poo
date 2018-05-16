
public class Produto {
	
		private String nome;
		private double preco;
		private Promocao promocao;
		public Produto(String nome, double preco, Promocao promocao) {
			this.nome = nome;
			this.preco = preco;
			this.promocao = promocao;
		}
		public void setPromocao(Promocao promocao) {
			this.promocao = promocao;
		}
		
		public double calcularPreco() {
			
//A vinculacao dinamica vai chamar o calculo do desconto de acordo com o objeto atrelado � variavel promocao
// do tipo promocao. O polimorfismo ajudou com a abertura de outras promocoes a serem atreladas a este
//atributo.			
			return preco * promocao.desconto(preco);
			
		}
		
		public void mostrar() {		
			System.out.println("Nome do produto: " + nome);		
			System.out.println("Pre�o do produto: " + preco * promocao.desconto(preco));
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}	
		
}
