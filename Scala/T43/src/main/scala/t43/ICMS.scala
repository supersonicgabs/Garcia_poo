package t43

class ICMS(desc: String) extends Desconto(desc) {

  override def desconto(valor: Double): Double = 0.90

}
