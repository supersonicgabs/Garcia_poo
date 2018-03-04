package T1

import T1.Churrasco
import T1.Pessoa

object Ihc {

  def main(args: Array[String]): Unit = {
    // TODO Auto-generated method stub
    val c: Churrasco = new Churrasco()
    val p1: Pessoa = new Pessoa()
    p1.idade = 12
    p1.nome = "Jose"
    p1.sexo = "m"
    p1.vegetariana = false
    val p2: Pessoa = new Pessoa()
    p2.idade = 22
    p2.nome = "Maria"
    p2.sexo = "f"
    p2.vegetariana = false
    val p3: Pessoa = new Pessoa()
    p3.idade = 3
    p3.nome = "Jose Alfredo"
    p3.sexo = "m"
    p3.vegetariana = true
    val p4: Pessoa = new Pessoa()
    p4.idade = 45
    p4.nome = "Vitor"
    p4.sexo = "m"
    p4.vegetariana = true
    val p5: Pessoa = new Pessoa()
    p5.idade = 38
    p5.nome = "Karla"
    p5.sexo = "f"
    p5.vegetariana = false
    c.verificarConsumo(p1)
    c.verificarConsumo(p2)
    c.verificarConsumo(p3)
    c.verificarConsumo(p4)
    c.verificarConsumo(p5)
  }

}
