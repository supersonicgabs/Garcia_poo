
public class Produto {
	private String nome;
	private double preco;
	private double des;
	private double s;
	Tipo tipo;
	
	
	public Produto(String nome, double preco, Tipo tipo) {		
		this.nome = nome;
		this.tipo = tipo;
		
		if(this.tipo == Tipo.IPI)
		{
			this.des = 5;
		}
		
		else if(this.tipo == Tipo.ICMS)
		{
			this.des = 10;
		}		
				
		this.s=100-des;
		this.preco = (s*preco/100);		
	}
	
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}

		
	
	public void mostrar() {		
		System.out.println("Nome do produto: " + nome);		
		System.out.println("Preço do produto: " + preco);
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}	
	
}