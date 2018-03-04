
public class Ihc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada l = new Lampada();
		
		l.limiteclicks=6;
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		l.clicklampada();
		l.estadoLampada();
		System.out.println("----------------------------------");
		System.out.println("Lampada 2:");
		
		Lampada l2 = new Lampada();
		
		l2.limiteclicks=3;
		l2.clicklampada();
		l2.estadoLampada();
		l2.clicklampada();
		l2.estadoLampada();
		l2.clicklampada();
		l2.estadoLampada();
		l2.clicklampada();
		l2.estadoLampada();
		
		

	}

}
