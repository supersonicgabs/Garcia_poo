import java.util.ArrayList;

public class Constelacao {
	private String nome;
	private Estrela[] estrelas;
	private int qtAtual;
	
	public Constelacao(String nome, int maxEstrela) {
		this.nome = nome;
		this.estrelas = new Estrela[maxEstrela];
	}

	public double tempConstelacao() {
		double soma = 0.0;
		for(int e=0; e < qtAtual; e++) {
			soma  += estrelas[e].getTemperatura();
		}
		return soma;
	}
	
	public void adicionar(Estrela e) {
		estrelas[qtAtual++] = e;	
	}
	
	public void infoEstrelas()
	{
		for(Estrela e : estrelas){
			System.out.println("Infos das Estrelas: " + e.getNome() + e.getTemperatura() + e.getCor());
		}		
		
	}
		
	
}
