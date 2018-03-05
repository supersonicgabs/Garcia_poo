package Ex2

object Ihc {
  def main(args: Array[String]): Unit = { // TODO Auto-generated method stub
    val l = new Lampada
    l.limiteclicks = 6
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    l.clicklampada()
    l.estadoLampada()
    println("----------------------------------")
    println("Lampada 2:")
    val l2 = new Lampada
    l2.limiteclicks = 3
    l2.clicklampada()
    l2.estadoLampada()
    l2.clicklampada()
    l2.estadoLampada()
    l2.clicklampada()
    l2.estadoLampada()
    l2.clicklampada()
    l2.estadoLampada()
  }
}