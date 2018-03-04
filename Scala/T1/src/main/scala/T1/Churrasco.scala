package T1

import T1.Pessoa

class Churrasco {

  var qtdCarne: Double = 0

  def verificarConsumo(p: Pessoa): Unit = {
    if (p.idade <= 3 || p.vegetariana) println(p.nome + " n consumira carne")
    else if (p.idade <= 12) {
      println(p.nome + " consome 1kg de carne")
      qtdCarne = qtdCarne + 1
      println("Quantidade total de Carne: " + qtdCarne)
    } else {
      println(p.nome + " consome 2kg de carne")
      qtdCarne = qtdCarne + 2
      println("Quantidade total de Carne: " + qtdCarne)
    }
  }

}