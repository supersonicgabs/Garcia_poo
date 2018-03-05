package Ex2

class Lampada {
  var estado = false
  var limiteclicks = 0

  def clicklampada(): Unit = {
    println("Click")
    if (limiteclicks > 0) if (estado) {
      estado = false
      limiteclicks -= 1
    }
    else {
      estado = true
      limiteclicks -= 1
    }
    else {
      println("Lampada Queimou!!")
      estado = false
    }
  }

  def estadoLampada(): Unit = {
    if (estado) println("Lampada Ligada")
    else println("Lampada Desligada")
  }
}