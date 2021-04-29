package basicos

import org.scalatest.flatspec._
import org.scalatest.matchers._

class Problem1036 extends AnyFlatSpec with should.Matchers {

  "A rotina 10.0 20.1 5.1" should "contabilizar 2 Raízes" in {
    val entrada = basicos.problem1036.Main.stringToDouble("10.0 20.1 5.1")
    val resp = basicos.problem1036.Main.imprimeContagemValores(entrada(0), entrada(1), entrada(2))
    assert(resp == "R1 = -0.29788\nR2 = -1.71212\n")
  }

  "A rotina 0.0 20.0 5.0" should "não contabilizar Raízes" in {
    val entrada = basicos.problem1036.Main.stringToDouble("0.0 20.0 5.0")
    val resp = basicos.problem1036.Main.imprimeContagemValores(entrada(0), entrada(1), entrada(2))
    assert(resp == "Impossivel calcular\n")
  }

  "A rotina 10.3 203.0 5.0" should "contabilizar 2 Raízes" in {
    val entrada = basicos.problem1036.Main.stringToDouble("10.3 203.0 5.0")
    val resp = basicos.problem1036.Main.imprimeContagemValores(entrada(0), entrada(1), entrada(2))
    assert(resp == "R1 = -0.02466\nR2 = -19.68408\n")
  }

  "A rotina 10.0 3.0 5.0" should "não contabilizar Raízes" in {
    val entrada = basicos.problem1036.Main.stringToDouble("10.0 3.0 5.0")
    val resp = basicos.problem1036.Main.imprimeContagemValores(entrada(0), entrada(1), entrada(2))
    assert(resp == "Impossivel calcular\n")
  }

}