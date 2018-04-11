package Ex3

import java.util.ArrayList

import scala.collection.JavaConverters._

class Constelacao(private var nome: String) {

  private var nomes: ArrayList[Estrela] = new ArrayList[Estrela]()

  private var temps: ArrayList[Estrela] = new ArrayList[Estrela]()

  private var cores: ArrayList[Estrela] = new ArrayList[Estrela]()

  def tempConstelacao(): Double = {
    var soma: Double = 0.0
    for (e <- temps.asScala) {
      soma += e.getTemperatura
    }
    soma
  }

  def adicionar(e: Estrela): Unit = {
    nomes.add(e)
    temps.add(e)
    cores.add(e)
  }

  def infoEstrelas(): Unit = {
    println("Nomes das estrelas:")
    for (e <- nomes.asScala) {
      println(e.getNome)
    }
    println("-------------------------------")
    println("Temperaturas das estrelas:")
    for (e <- temps.asScala) {
      println(e.getTemperatura)
    }
    println("-------------------------------")
    println("Cores das estrelas:")
    for (e <- cores.asScala) {
      println(e.getCor)
    }
    println("-------------------------------")
  }
}