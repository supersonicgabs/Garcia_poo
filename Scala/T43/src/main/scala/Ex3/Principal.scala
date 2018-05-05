package Ex3

import Ex3.Produto
import Ex3.Tipo.Tipo

object Principal {

  def main(args: Array[String]): Unit = {
    // TODO Auto-generated method stub
    val p: Produto = new Produto("Camisa Paisley", 500, Tipo.IPI)
    val p2: Produto = new Produto("Camisa Paisley", 500, Tipo.ICMS)
    p.mostrar()
    p2.mostrar()
  }

}

