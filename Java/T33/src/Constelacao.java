import java.util.ArrayList;

public class Constelacao {
	private String nome;
	private ArrayList<Estrela> nomes;
	private ArrayList<Estrela> temps;
	private ArrayList<Estrela> cores;
	
	public Constelacao(String nome) {
		this.nome = nome;
		this.nomes =  new ArrayList<Estrela>();
		this.temps =  new ArrayList<Estrela>();
		this.cores =  new ArrayList<Estrela>();
	}

	public double tempConstelacao() {
		double soma = 0.0;
		for(Estrela e : temps) {
			soma  += e.getTemperatura();
		}
		return soma;
	}
	
	public void adicionar(Estrela e) {
		nomes.add(e);
		temps.add(e);
		cores.add(e);
	}
	
	public void infoEstrelas()
	{
		System.out.println("Nomes das estrelas:");
		for(Estrela e : nomes)
		{
			System.out.println(e.getNome());
		}
		
		System.out.println("-------------------------------");
		System.out.println("Temperaturas das estrelas:");
		
		for(Estrela e : temps)
		{
			System.out.println(e.getTemperatura());
		}
		
		System.out.println("-------------------------------");
		System.out.println("Cores das estrelas:");		
		
		for(Estrela e : cores)
		{
			System.out.println( e.getCor());
		}
		
		System.out.println("-------------------------------");
		
		
	}
		
	
}
