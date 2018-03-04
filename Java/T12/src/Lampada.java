
public class Lampada {
	boolean estado=false;
	int limiteclicks;
	
	void clicklampada() {
		System.out.println("Click");
		if(limiteclicks > 0) {
			if(estado) {
				estado = false;
				limiteclicks--;
			}			
			else 
			{
				estado = true;
				limiteclicks--;
			}
		}
		else {
			System.out.println("Lampada Queimou!!");
			estado = false;
		}			
	}
	
	void estadoLampada(){
		if(estado)
			System.out.println("Lampada Ligada");
		else
			System.out.println("lampada Desligada");
	}
	
	
	
}
