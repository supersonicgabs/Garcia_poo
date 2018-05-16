package t43

import scala.beans.{BeanProperty, BooleanBeanProperty}

class Desconto(@BeanProperty var desc: String) {

  def desconto(valor: Double): Double = 1.0

}
