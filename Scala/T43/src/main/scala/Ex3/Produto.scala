package Ex3

import Ex3.Tipo.Tipo

class Produto(var nome: String, var preco: Double, tipo: Tipo) {

  if (this.tipo == Tipo.IPI) {
    this.des = 5
  } else if (this.tipo == Tipo.ICMS) {
    this.des = 10
  }

  private var des: Double = _

  private var s: Double = 100 - des

  this.preco = (s * preco / 100)

  def mostrar(): Unit = {
    println("Nome do produto: " + nome)
    println("Preço do produto: " + preco)
    println("~~~~~~~~~~~~~~~~~~")
  }

}