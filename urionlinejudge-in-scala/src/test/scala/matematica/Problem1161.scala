package matematica

import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._


class Problem1161 extends AnyFlatSpec with should.Matchers{

  matematica.problem1161.Main.fatorial(BigInt.int2bigInt(0)) should equal(BigInt.int2bigInt(1))
  matematica.problem1161.Main.fatorial(BigInt.int2bigInt(1)) should equal(BigInt.int2bigInt(1))
  matematica.problem1161.Main.fatorial(BigInt.int2bigInt(2)) should equal(BigInt.int2bigInt(2))
  matematica.problem1161.Main.fatorial(BigInt.int2bigInt(3)) should equal(BigInt.int2bigInt(6))
  matematica.problem1161.Main.fatorial(BigInt.int2bigInt(4)) should equal(BigInt.int2bigInt(24))


  matematica.problem1161.Main.fatorial(BigInt.int2bigInt(0)) + matematica.problem1161.Main.fatorial(BigInt.int2bigInt(2)) should equal(BigInt.int2bigInt(3))

}
