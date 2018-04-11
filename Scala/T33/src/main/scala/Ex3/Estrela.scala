package Ex3

import scala.beans.{BeanProperty, BooleanBeanProperty}

class Estrela(@BeanProperty var nome: String,
              @BeanProperty var temperatura: Double,
              @BeanProperty var cor: String) {

  def mostrar(): Unit = {
    println("Nome da estrela: " + nome)
    println("Temperatura da estrela: " + temperatura)
    println("Cor da estrela: " + cor)
    println("~~~~~~~~~~~~~~~~~~")
  }

}
