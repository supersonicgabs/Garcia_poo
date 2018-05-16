package t43

object Principal {

  def main(args: Array[String]): Unit = {
    val p: Produto =
      new Produto("Camisa Paisley", 500, new IPI("Desconto IPI"))
    val p2: Produto = new Produto("Bucket Hat", 500, new ICMS("Desconto ICMS"))
    p.calcularPreco()
    p.mostrar()
    p2.calcularPreco()
    p2.mostrar()
  }

}