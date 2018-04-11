package Ex3

object Principal {

  def main(args: Array[String]): Unit = {
    val c: Constelacao = new Constelacao("Nome Constelação")
    val e0: Estrela = new Estrela("Endor", 45.5, "Azul")
    val e1: Estrela = new Estrela("Tatooine 1", 32.1, "Vermelho")
    val e2: Estrela = new Estrela("Coruscant", 20, "Verde")
    c.adicionar(e0)
    c.adicionar(e1)
    c.adicionar(e2)
    e0.mostrar()
    e1.mostrar()
    e2.mostrar()
    c.infoEstrelas()
    println("Total das temperaturas: " + c.tempConstelacao())
  }

}
