
public class Desconto {

		private String desc;

		
		public Desconto(String desc) {
			this.desc = desc;
		}


		public String getDesc() {
			return desc;
		}
		
//Nao sei como calcular descontos em uma promocao generica. Aqui eu dependo de subclasses de promocao
		public double desconto(double valor) {
			return 1.0;
		}
		
}
