package matematica

import org.scalatest.flatspec._
import org.scalatest.matchers._


class Problem1212 extends AnyFlatSpec with should.Matchers {

  matematica.problem1212.Main.somaDigito(1922,9999,1,0) should equal(11)
  matematica.problem1212.Main.contaVaiUmTodosDigitos(123, 456) should equal(0)
  matematica.problem1212.Main.contaVaiUmTodosDigitos(555, 555) should equal(3)
  matematica.problem1212.Main.contaVaiUmTodosDigitos(123, 594) should equal(1)
  matematica.problem1212.Main.contaVaiUmTodosDigitos(0, 0) should equal(0)


}
