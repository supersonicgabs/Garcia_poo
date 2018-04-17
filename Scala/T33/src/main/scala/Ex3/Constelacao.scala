package Ex3

import java.util.ArrayList

class Constelacao(private var nome: String, maxEstrela: Int) {

  private var estrelas: Array[Estrela] = new Array[Estrela](maxEstrela)

  private var qtAtual: Int = _

  def tempConstelacao(): Double = {
    var soma: Double = 0.0
    for (e <- 0 until qtAtual) {
      soma += estrelas(e).getTemperatura
    }
    soma
  }

  def adicionar(e: Estrela): Unit = {
    estrelas({ qtAtual += 1; qtAtual - 1 }) = e
  }

  def infoEstrelas(): Unit = {
    for (e <- estrelas) {
      println(
        "Infos das Estrelas: " + e.getNome + e.getTemperatura +
          e.getCor)
    }
  }

}
