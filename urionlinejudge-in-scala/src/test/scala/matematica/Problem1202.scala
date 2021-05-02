package matematica

import org.scalatest.flatspec._
import org.scalatest.matchers._


class Problem1202 extends AnyFlatSpec with should.Matchers {

  // val arrayTestSorted = Array[Long](7, 15, 20, 22, 25, 29, 31, 45, 54, 60, 67, 69, 70, 71, 75, 78, 91, 125)

  matematica.problem1202.MainCached.fibo(2) should equal(1L)
  matematica.problem1202.MainCached.fibo(1) should equal(1L)
  matematica.problem1202.MainCached.fibo(10) should equal(55L)
  matematica.problem1202.MainCached.fibo(6) should equal(8L)

//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(10, arrayTestSorted) should equal(Some(7L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(11, arrayTestSorted) should equal(Some(7L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(17, arrayTestSorted) should equal(Some(15L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(19, arrayTestSorted) should equal(Some(15L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(20, arrayTestSorted) should equal(Some(20L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(26, arrayTestSorted) should equal(Some(25L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(70, arrayTestSorted) should equal(Some(70L))
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(2, arrayTestSorted) should equal(None)
//  matematica.problem1202.MainCached.buscaPrimeiraMenorLong(300, arrayTestSorted) should equal(Some(125L))

}
