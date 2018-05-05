package Ex3

object Tipo extends Enumeration {

  val IPI: Tipo = new Tipo()

  val ICMS: Tipo = new Tipo()

  class Tipo extends Val

  implicit def convertValue(v: Value): Tipo = v.asInstanceOf[Tipo]

}