package t43

class Produto(private var nome: String,
              private var preco: Double,
              private var desconto: Desconto) {

  def setPromocao(desconto: Desconto): Unit = {
    this.desconto = desconto
  }

  def calcularPreco(): Double = preco * desconto.desconto(preco)

  def mostrar(): Unit = {
    println("Nome do produto: " + nome)
    println("Preço do produto: " + preco * desconto.desconto(preco))
    println("~~~~~~~~~~~~~~~~~~")
  }

}
