
public class Ihc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Churrasco c =  new Churrasco();
		
		Pessoa p1 = new Pessoa();
		p1.idade = 12;
		p1.nome = "Jose";
		p1.sexo = "m";
		p1.vegetariana =false;

		Pessoa p2 = new Pessoa();
		p2.idade = 22;
		p2.nome = "Maria";
		p2.sexo = "f";
		p2.vegetariana =false;
		
		Pessoa p3 = new Pessoa();
		p3.idade = 3;
		p3.nome = "Jose Alfredo";
		p3.sexo = "m";
		p3.vegetariana =true;
		
		Pessoa p4 = new Pessoa();
		p4.idade = 45;
		p4.nome = "Vitor";
		p4.sexo = "m";
		p4.vegetariana =true;
		
		Pessoa p5 = new Pessoa();
		p5.idade = 38;
		p5.nome = "Karla";
		p5.sexo = "f";
		p5.vegetariana =false;
		
		c.verificarConsumo(p1);
		c.verificarConsumo(p2);
		c.verificarConsumo(p3);
		c.verificarConsumo(p4);
		c.verificarConsumo(p5);
		

	}

}
