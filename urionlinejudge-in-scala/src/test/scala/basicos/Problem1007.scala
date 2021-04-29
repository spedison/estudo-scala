package basicos

import org.scalatest.flatspec._
import org.scalatest.matchers._

import scala.collection.mutable.Stack

class Problem1007 extends AnyFlatSpec with should.Matchers {

  basicos.problem1007.Main.calcula(5, 6, 7, 8) should equal(-26)

  basicos.problem1007.Main.calculaString(0, 0, 7, 8) should equal("DIFERENCA = -56")

  basicos.problem1007.Main.calculaString(5, 6, -7, 8) should equal("DIFERENCA = 86")


}