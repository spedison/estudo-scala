package strings

import org.scalatest.flatspec._
import org.scalatest.matchers._

class Problem1168 extends AnyFlatSpec with should.Matchers {

  "Conta Leds de 115380" should "" in {
    assert(basicos.problem1168.Main.contaLeds("115380") == 27)
  }

  "Conta Leds de 2819311" should "" in {
    assert(basicos.problem1168.Main.imprimeLeds("2819311") == "29 leds\n")
  }

  "Conta Leds de 23456" should "" in {
    assert(basicos.problem1168.Main.imprimeLeds("23456") == "25 leds\n")
  }

}