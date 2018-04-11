
public class Estrela {
	private String nome;
	private double temperatura;
	private String cor;
	
	
	public Estrela(String nome, double temperatura, String cor) {		
		this.nome = nome;
		this.temperatura = temperatura;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public String getCor() {
		return cor;
	}
	
	public void mostrar() {		
		System.out.println("Nome da estrela: "+ nome);		
		System.out.println("Temperatura da estrela: " + temperatura);
		System.out.println("Cor da estrela: " + cor);
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
	
}
