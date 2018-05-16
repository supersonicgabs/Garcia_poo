package t43

class IPI(desc: String) extends Desconto(desc) {

  override def desconto(valor: Double): Double = 0.95

}
